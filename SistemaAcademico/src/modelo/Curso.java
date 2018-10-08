package modelo;

import java.util.List;

public class Curso {
	//criacao dos atributos
	private String nome;
	private int codigoCurso;
	private String turno;
	private String coordenador;
	private List<Disciplina> disciplinas;
	
	//criacao do construtor
	public Curso(String nome, int codigoCurso, String turno, String coordenador, List<Disciplina> disciplinas) {
		this.nome = nome;
		this.codigoCurso = codigoCurso;
		this.turno = turno;
		this.coordenador = coordenador;
		this.disciplinas = disciplinas;
	}
	
//criacao dos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
