package com.estrategit.curso.herencia.polimorfismo;

import com.estrategit.curso.Rectangulo;

public class Triangulo extends Figura {
	protected Double altura;
	protected Double base;

	public Triangulo(Double altura, Double base) {
		this.altura = altura;
		this.base = base;
		nombre = "Triangulo";
	}

	@Override
	public Double getArea() {
		return (base * altura) / 2;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
