package app;

import entities.ContaBancaria;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Número da conta: ");
		int number = sc.nextInt();

		System.out.println("Nome do titular: ");
		String name = sc.next();

		System.out.println("Deseja fazer um depósito inicial? (S/N) ");
		String dep = sc.next();
		
		ContaBancaria c1 = null;
		
		if (dep.equals("S") || dep.equals("s")) {
			System.out.println("Valor depósito inicial:  ");
			double dvalue = sc.nextDouble();
			c1 = new ContaBancaria(number, name, dvalue);
			c1.update();
		} else if (dep.equals("N") || dep.equals("n")) {
			System.out.println("Conta criada com Sucesso.");
			c1 = new ContaBancaria(number, name);
			c1.update();
		}
		
		System.out.println("Valor do deposito: ");
		double dvalue = sc.nextDouble();
		c1.deposit(dvalue);
		c1.update();
		
		System.out.println("Valor do saque: ");
		double svalue = sc.nextDouble();
		c1.saque(svalue);
		c1.update();
		

		sc.close();

	}
}
