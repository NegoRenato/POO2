package revisao;

public class Aluno  extends Pessoa{
	private String curso;

	public Aluno(String nome, int idade, String curso, Endereco endereco) {
		super(nome, idade, endereco);
		this.curso = null;
	}
	
	public void realizarMatricula(String curso) {
		this.curso = curso;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("aluno esta matriculado no curso " + this.curso);
	}
}
