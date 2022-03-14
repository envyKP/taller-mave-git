package com.estrategit.curso.herencia.polimorfismo;

import com.estrategit.curso.Persona;
import com.estrategit.curso.Rectangulo;

public class Lanzador {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(20.5, 10.5);
		Circulo circulo = new Circulo(10.5);
		Cuadrado cuadrado = new Cuadrado(5.5);
		Triangulo triangulo = new Triangulo(5.5, 10.5);
		CalculadiraFigura.calcularAreaFigura(rectangulo);
		CalculadiraFigura.calcularAreaFigura(circulo);
		CalculadiraFigura.calcularAreaFigura(cuadrado);
		CalculadiraFigura.calcularAreaFigura(triangulo);
		CalculadiraFigura.tipoFigura(rectangulo);
		//Circulo.PI = 5.12;
		CalculadiraFigura.calcularAreaFigura(circulo);
		CalculadiraFigura.tipoFigura(circulo);

	}
}
