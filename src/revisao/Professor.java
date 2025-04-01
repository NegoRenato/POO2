package revisao;

public class Professor extends Pessoa{
	
	private double salarioBase;
	private double salarioTitulacao;
	
	public Professor(String nome, int idade, double salarioBase, double salarioTitulacao, Endereco endereco) {
	super(nome, idade, endereco);
	this.salarioBase = salarioBase;
	this.salarioTitulacao = salarioTitulacao;
	}
	
	public double calcularSalario() {
		double salarioTotal;
		
		salarioTotal = this.salarioBase + this.salarioTitulacao;
		return salarioTotal;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("salario base " + this.salarioBase + "salario por titulação " + this.salarioTitulacao);
		System.out.println("salario total " + this.calcularSalario());
	}
	
}
