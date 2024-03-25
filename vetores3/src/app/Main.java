package app;

import java.util.Scanner;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão? ");
		int qtd = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[qtd];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da pessoa " + i);
			System.out.println("Nome: ");
			String n = sc.next();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			System.out.println("Altura: ");
			double a = sc.nextDouble();
			pessoas[i] = new Pessoa(n, a, age);
		}

		int pessoaMenor = 0;
		double qtdAltura = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				pessoaMenor++;
			}
			qtdAltura += pessoas[i].getAltura();
		}

		double percent = (pessoaMenor / pessoas.length) * 100;
		double media = qtdAltura / pessoas.length;

		System.out.println("porcentagem de pessoas menores de 16 anos: " + percent + "%");
		System.out.println("Média de altura: " + media);

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
		sc.close();

	}

}
