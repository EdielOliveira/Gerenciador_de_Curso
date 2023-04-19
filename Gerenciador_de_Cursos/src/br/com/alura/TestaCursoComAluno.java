package br.com.alura;

import java.util.List;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
		javaColecoes.adiciona(new Aula("Revisando com LinkedList", 15));
		javaColecoes.adiciona(new Aula("Aprofundando com Listas", 17));

		Aluno a1 = new Aluno("Flavio Sacarini", 45678);
		Aluno a2 = new Aluno("Sergio Lopes", 58587);
		Aluno a3 = new Aluno("Mariana Santana", 98904);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os Alunos matriculados");

		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});

		System.out.println("O aluno " + a1 + ", Esta Matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno Sacarini = new Aluno("Flavio Sacarini", 45678);
		System.out.println("E esse Sacarini, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(Sacarini));

		System.out.println("O a1 e equals ao Sacarini?");
		System.out.println(a1.equals(Sacarini));

		// obrigatoriamente o seguinte é true:

	}
}
