package com.lovelacetecnologia;

public class Telefone {

	
	public String pegandoDdd(String numero) {
		return numero.substring(0, 2);
	}

	public String pegandoDddIdentificandooEstado(String ddd) {
		
		String silglaEstado;
		
		if(ddd.equals("24")){ 
			
			silglaEstado = ("RJ");
			
			return silglaEstado; 
			
		}
		
		
		return "Não encontramos a região com DDD informado !";
	}

	public String pegandoNumero(String numero) {
		return numero.substring(4);
	}
	
}
