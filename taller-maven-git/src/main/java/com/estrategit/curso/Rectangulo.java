package com.estrategit.curso;

import com.estrategit.curso.herencia.polimorfismo.Figura;

public class Rectangulo extends Figura {

	protected Double altura;
	protected Double base;
	//public static String nombre;
	static {
		
	//	nombre = "Rectangulo";
	}
	
	public Rectangulo(Double base, Double altura) {
	this.altura = altura;
	this.base = base ;
	nombre = "Rectangulo";
	}
	
	@Override
	public Double getArea() {
			return base*altura;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	
}
