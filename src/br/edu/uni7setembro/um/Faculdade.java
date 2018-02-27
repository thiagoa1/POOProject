package br.edu.uni7setembro.um;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
	
	String nome;
	String endereco;
	List<Curso> cursos = new ArrayList<Curso>();
	
	public Faculdade(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

}
