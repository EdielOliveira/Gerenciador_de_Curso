package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo Vieira");
		alunos.add("Pedro Bratoniuns");
		alunos.add("Mariana Santana");
		alunos.add("Sergio Lopes");
		alunos.add("Flavio Sacarini");

		System.out.println(alunos.size());

		alunos.add("Sergio Lopes");

		for (String aluno : alunos) {
			System.out.println(aluno);

			boolean adicionou = alunos.add("Sergio Lopes");
			System.out.println("Fabricio foi adicionado ao Set? " + adicionou);
		}

	}
}
