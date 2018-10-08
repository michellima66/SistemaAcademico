package modelo;

import java.util.List;

public class Aluno {
	//criacao dos atributos
	private String nome;
	private String cpf;
	private String endereco;
	private String eMail;
	private String telefone;
	private String matricula;
	private String situacao;
	private Curso curso;
	private List<Disciplina> disciplina;
	
	//criando metodos
	public Aluno(){
		
	}

	public Aluno(String nome, String cpf, String endereco, String eMail, String telefone, String matricula,
			String situacao, Curso curso, List<Disciplina> disciplina) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.eMail = eMail;
		this.telefone = telefone;
		this.matricula = matricula;
		this.situacao = situacao;
		this.curso = curso;
		this.disciplina = disciplina;
	}
	
	//metodo getters e setters
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
}
