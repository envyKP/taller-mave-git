package com.estrategit.curso;

/*
 *@Autor: EnvyKP
 */
import java.lang.*;

//clase de pruebas taller 5
public class Persona {

	public static Integer contadorPersona;

	static {
		contadorPersona=0;
		
	}
	
	private String nombrePersona;
	private String cedula;

	public Persona(String nombre, String cedula) {
		this.cedula = cedula;
		nombrePersona = nombre;
		contadorPersona++;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String convertirCadena() {

		return nombrePersona + " " + cedula;
	}
	public static Integer getContadorPersona() {
		return contadorPersona;
		
		
	}
	
	///antes presentaba espacio de memoria ahora muestra el elemento
	public String toString() {
		return nombrePersona+ "  "+cedula;
	}
	
}
