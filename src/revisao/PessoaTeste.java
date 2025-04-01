package revisao;

public class PessoaTeste {
	public static void main(String [] args) {
		Endereco endereco01 = new Endereco("rua alguma", 250, "porteira", "laquela", "PR");
		Endereco endereco02 = new Endereco("palmeiras ", 1951, "pinga", "Sao paulo", "SP");
		Endereco endereco03 = new Endereco("corinthians", 1910, "ladrao", "Sao Paulo", "SP");
		Pessoa pessoa01 = new Pessoa("jose", 19, endereco01);
		Aluno aluno01 = new Aluno("renato antonio", 19, null, endereco02);
		Professor professor01 = new Professor("jose", 50, 3500, 1500, endereco03);
		
		professor01.imprimirDados();
	}
}
