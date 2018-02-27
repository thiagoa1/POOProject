package br.edu.uni7setembro.um;

public class Application {

	public static void main(String[] args) {
		Faculdade faculdade = new Faculdade("Uni7", "Rua 1");
		faculdade.cursos.add(new Curso("SI", 30));
		faculdade.cursos.add(new Curso("Direito", 45));

		System.out.println("Nome: " + faculdade.nome);
		System.out.println("Endereço: " + faculdade.endereco);

		for (Curso curso : faculdade.cursos) {
			System.out.println("=============================");
			System.out.println("Curso: " + curso.nome);
			System.out.println("Vagas: " + curso.vagas);
		}

		// Animal animal = new Animal();
		// animal.addOrgao(new Orgao());

		Pessoa pessoa = new Pessoa("TRP", "12345678912", new Profissao("Professor", 2000d));

		Veiculo veiculo = new Veiculo("354681354168451", "VW", new Motor(80, 120d));

		Time time = new Time("Bangu", "D");
		Titulo titulo = new Titulo(10.000, 1911);

		time.titulos.add(titulo);

	}

}
