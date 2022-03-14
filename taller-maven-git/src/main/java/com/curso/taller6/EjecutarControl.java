package com.estrategit.curso.taller6;

import com.estrategit.curso.interfacescontrolflujo.Interruptor;
import com.estrategit.curso.interfacescontrolflujo.InterruptorGamaAlta;
import com.estrategit.curso.taller6.dispositivos.Aire_acondicionado;
import com.estrategit.curso.taller6.dispositivos.Dispositivos;
import com.estrategit.curso.taller6.dispositivos.Dvd;
import com.estrategit.curso.taller6.dispositivos.Television;

public class EjecutarControl {

	public static void main(String[] args) {
		Opciones opciones = new Opciones();
		Dvd dvd = new Dvd();
		Television television = new Television();
		Aire_acondicionado acondicionado = new Aire_acondicionado();
		// String cambio = television.getNombre();

		/*
		 * switch(television) { case dvd.getNombre():
		 */
		System.out.println("cambio");
		System.out.println(dvd.getNombre());
		opciones.encender();
		opciones.reproducir();
		opciones.detener();
		opciones.avanzar();
		opciones.rebobinar();
		opciones.apagar();
		System.out.println("cambio");
		System.out.println(television.getNombre());
		opciones.encender();
		opciones.avanzar();
		opciones.rebobinar();
		opciones.apagar();
		System.out.println("cambio");
		System.out.println(acondicionado.getNombre());
		opciones.encender();
		opciones.subir();
		opciones.bajar();
		opciones.apagar();

		/*
		 * break; }
		 */

	}
}
