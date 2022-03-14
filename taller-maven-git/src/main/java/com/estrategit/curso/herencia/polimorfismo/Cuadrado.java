package com.estrategit.curso.herencia.polimorfismo;

import com.estrategit.curso.Rectangulo;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Double lado) {
		super(lado, lado);
		nombre = "cuadrado";
	}
	
	
}
