package entities;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}
	
	
	public void aumentar_salario(double percent) {
		percent = percent/100;
		salario = salario * (1 + percent);
	}
	
	
	
}
