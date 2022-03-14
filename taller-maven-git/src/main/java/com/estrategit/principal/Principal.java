package com.estrategit.principal;

import com.estrategit.curso.Persona;
import com.estrategit.curso.Socio;

public class Principal {

	public static void main(String[] args) {
		Persona persona = new Persona("Kev", "000001");
		Persona otraPersona = persona;
		System.out.println(persona);
		System.out.println(persona.getNombrePersona());
		System.out.println(persona.getCedula());
		
		System.out.println(persona.convertirCadena());
		persona.setNombrePersona("john");
		System.out.println(otraPersona.convertirCadena());
		
		otraPersona = null;
		
		
		System.out.println(Persona.contadorPersona);
		Persona personaNueva = new Persona("second", "0000002");
		
		System.out.println("numero de personas "+ persona.contadorPersona);
		
		Socio socio = new Socio("icaela", "000006");
		System.out.println(socio.getNombrePersona());
		
	}

}
