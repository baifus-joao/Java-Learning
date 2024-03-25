package app;

import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas irão locar? ");
		int qtd = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[9];

		for (int i = 0; i <= qtd; i++) {
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int numeroQuarto = sc.nextInt();
			pessoas[numeroQuarto] = new Pessoa(nome, email, numeroQuarto);
		}

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 9; i++) {
			if (pessoas[i] != null) {
				System.out.println("Quarto: " + pessoas[i].getQuarto() + " Nome: " + pessoas[i].getNome() + " Email: "
						+ pessoas[i].getEmail());
			}
		}

		sc.close();


	}

}
