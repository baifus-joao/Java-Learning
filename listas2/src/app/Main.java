package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionários serão digitados? ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();

			list.add(new Funcionario(id, nome, salario));

		}

		System.out.println("Digite o ID do Funcionário que terá aumento no salário: ");
		int idsalary = sc.nextInt();
		Integer pos = posicao(list, idsalary);
		if (pos == null) {
			System.out.println("ESSE ID NÃO EXISTE.");
		} else {
			System.out.println("De quantos % será o aumento? ");
			double aumento = sc.nextDouble();

			list.get(pos).aumentar_salario(aumento);

			System.out.println("ID: " + list.get(pos).getId() + " , Nome: " + list.get(pos).getNome() + " , Salário: " + list.get(pos).getSalario());
		}
		sc.close();
	}

	static Integer posicao(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	static boolean existeId(List<Funcionario> list, int id ) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
