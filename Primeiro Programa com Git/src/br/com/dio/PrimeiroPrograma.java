package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		gato.setNome("Leandro");
		gato.setIdade(33);
		
		
		System.out.println(gato);

	}

}
