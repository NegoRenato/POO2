package revisao;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, int idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome + " " + this.idade);
	}
	
}
