package entities;

public class ContaBancaria {
	private int number;
	private String name;
	private double saldo;

	public ContaBancaria(int number, String name, double depInicial) {
		this.number = number;
		this.name = name;
		deposit(depInicial);
	}

	public ContaBancaria(int number, String name) {
		this.number = number;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getSaldo() {
		return saldo;
	}

	public void update() {
		System.out.println("Número da conta: " + number + ", Proprietário: " + name + ", Saldo: " + saldo);
	}

	public void deposit(double dvalue) {
		saldo += dvalue;

	}

	public void saque(double svalue) {
		saldo -= (svalue + 5);

	}

}