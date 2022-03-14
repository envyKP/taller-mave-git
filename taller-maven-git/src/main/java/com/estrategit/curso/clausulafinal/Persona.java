package com.estrategit.curso.clausulafinal;

public class Persona {

	protected String cedula;
	
	public Persona(String cedula) {
		this.cedula = cedula;
		
	}
	public final String obtenerCedula() {
		return cedula;
	}
	
}
