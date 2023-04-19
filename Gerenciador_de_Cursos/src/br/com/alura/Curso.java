package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String Instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		Instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return Instrutor;
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);

	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) { // para cada aula quero fazer que Tempo Total vale ele mesmo mais aula.getTempo
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + " tempo total:" + getTempoTotal() + " , Aulas: " + this.aulas + " ]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public int hashCode() {
		return this.nome.hashCode();
	}
}
