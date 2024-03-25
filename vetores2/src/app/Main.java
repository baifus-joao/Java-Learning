package app;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product vect[] = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.printf("Products average price: %.2f", avg);
		sc.close();

	}

}
