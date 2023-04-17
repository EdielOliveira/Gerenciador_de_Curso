package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as Arraylist", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		// esta Arraylist é EXCLUSIVAMENTE de "Aula", ou seja, nao para um String
		// ("");ex: ArrayList<String> aulas...

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		Collections.sort(aulas);

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		// "quero que voce ordene as aulas comparando o TEMPO das aulas"

		System.out.println(aulas);
	}
}