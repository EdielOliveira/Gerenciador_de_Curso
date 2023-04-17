package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
		javaColecoes.adiciona(new Aula("Revisando com LinkedList", 15));
		javaColecoes.adiciona(new Aula("Aprofundando com Listas", 17));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
	}

}
