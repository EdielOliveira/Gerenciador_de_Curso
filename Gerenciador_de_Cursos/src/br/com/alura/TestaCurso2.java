package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
		javaColecoes.adiciona(new Aula("Revisando com LinkedList", 15));
		javaColecoes.adiciona(new Aula("Aprofundando com Listas", 17));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas1 = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas1);
		System.out.println(aulas1);

		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());

		System.out.println(javaColecoes);
	}

}
