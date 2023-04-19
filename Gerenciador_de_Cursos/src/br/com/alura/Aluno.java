package br.com.alura;

import java.util.Objects;

public class Aluno {
	private String nome;
	private int NumerodeMatricula;

	public Aluno(String nome, int numerodeMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");

		}
		this.nome = nome;
		NumerodeMatricula = numerodeMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumerodeMatricula() {
		return NumerodeMatricula;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return NumerodeMatricula == other.NumerodeMatricula && Objects.equals(nome, other.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(NumerodeMatricula, nome);
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.NumerodeMatricula + "]";
	}
}
