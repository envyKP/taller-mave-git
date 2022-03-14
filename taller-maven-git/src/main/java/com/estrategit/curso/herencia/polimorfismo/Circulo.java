package com.estrategit.curso.herencia.polimorfismo;

public class Circulo extends Figura {
	public static final Double PI;
	private Double radio;
	//public static String nombre;
	
	
	static {
		PI = 3.1416;
		//nombre = "Circulo";
	}

	public Circulo (Double radio) {
		this.radio = radio;
		nombre = "Circulo";
		
	}
	public Double getArea() {
		return PI * radio * radio;

	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	

}
