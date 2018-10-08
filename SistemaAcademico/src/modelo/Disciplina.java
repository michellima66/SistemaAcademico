package modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	//criacao dos atributos
	private String nome;
	private int codigo;
	private List<Aluno> chamada = new ArrayList<Aluno>();
	private int numerSala;
	private int cargaHorariaDaDisciplina;
	private String horario;
	private double custo;
	
	//criacao dos metodos
	public Disciplina(String nome, int codigo, List<Aluno> chamada, int numerSala, int cargaHorariaDaDisciplina,
			String horario, double custo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.chamada = chamada;
		this.numerSala = numerSala;
		this.cargaHorariaDaDisciplina = cargaHorariaDaDisciplina;
		this.horario = horario;
		this.custo = custo;
	}
	
	//criacao dos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Aluno> getChamada() {
		return chamada;
	}

	public void setChamada(List<Aluno> chamada) {
		this.chamada = chamada;
	}

	public int getNumerSala() {
		return numerSala;
	}

	public void setNumerSala(int numerSala) {
		this.numerSala = numerSala;
	}

	public int getCargaHorariaDaDisciplina() {
		return cargaHorariaDaDisciplina;
	}

	public void setCargaHorariaDaDisciplina(int cargaHorariaDaDisciplina) {
		this.cargaHorariaDaDisciplina = cargaHorariaDaDisciplina;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
}
