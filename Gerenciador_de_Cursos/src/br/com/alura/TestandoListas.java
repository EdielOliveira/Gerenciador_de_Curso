package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String curso1 = "Conhecendo mais de listas";
		String curso2 = "Modelando a classse Aula";
		String curso3 = "Trabalhando com Cursos e Sets";
		String curso4 = "Ascarinlubrincoides";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);

		System.out.println(cursos);

		cursos.remove(0);

		System.out.println(cursos);

		for (String curso : cursos) { // para cada String curso dentro de cursos; faça o seguinte:""
			System.out.println("Aula: [" + curso + "]");

		}

		String primeirocurso = cursos.get(0);
		System.out.println("A primeira aula e: [" + primeirocurso + "]");

		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("aula : " + cursos.get(i));

			cursos.forEach(curso -> // (Metodo)para cada objeto(curso)dentro de objeto(curso) execulte este trecho
									// de codigo: ""
			{
				System.out.println("percorrendo Aula: " + curso);
			});

			Collections.sort(cursos);// Collections.ordena a minha lista que se chama "cursos"(Esta modificando a
										// lista que esta como argumento, e vai coordernar/ordenrar)
			System.out.println(cursos);

		}

	}

}
