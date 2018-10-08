package modelo;

import java.util.List;

public class Professor {
	//criacao dos atributos
	private String nome;
	private String cpf;
	private String endereco;
	private String eMail;
	private String telefone;
	private String categoria;
	private List<Disciplina> disciplina;
	
	//criacao dos metodos
	public Professor(String nome, String cpf, String endereco, String eMail, String telefone, String categoria,
			List<Disciplina> disciplina) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.eMail = eMail;
		this.telefone = telefone;
		this.categoria = categoria;
		this.disciplina = disciplina;
	}
	
	//criando os getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
}
