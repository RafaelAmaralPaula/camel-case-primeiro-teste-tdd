package com.lovelacetecnologia;

public class CamelCaseConverter {

	public String converter(String nome) {
		return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
	}

	public String converterNomeCompleto(String PrimeiroNome, String SegundoNome) {

		String nomeFormatado = PrimeiroNome.substring(0, 1).toUpperCase() + PrimeiroNome.substring(1)
				+ SegundoNome.substring(0, 2).toUpperCase() + SegundoNome.substring(2).toLowerCase();

		return nomeFormatado;
	}

}
