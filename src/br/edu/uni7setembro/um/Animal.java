package br.edu.uni7setembro.um;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	
	String nome;
	List<Orgao> orgaos = new ArrayList<>();
	
	public Animal(String nome) {
		this.nome = nome;
	}

}
