package com.estrategit.curso.herencia.polimorfismo;

public class CalculadiraFigura {

		public static void calcularAreaFigura(Figura figura) {
			System.out.println("El area de la figura ("+figura.nombre+") es:"+ figura.getArea());
		}
		
		public static void tipoFigura(Figura figura) {
			System.out.println("la figura es un:"+ figura.getNombre());
		}
}
