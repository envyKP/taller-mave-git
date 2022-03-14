package com.estrategit.curso.taller6;

public class Opciones {
	private static final String APAGAR = "Apagar";
	private static final String ENCENDER = "Encender";

	
		
	public String ejecutar(String comando) {

		return "Comando:" + comando + ", ejecutando";
	}

	public void encender() {
		presentarResultadoComando(ENCENDER);

	}

	public void apagar() {
		presentarResultadoComando(APAGAR);

	}
	
	public void subir() {
		presentarResultadoComando("Subir");

	}
	public void bajar() {
		presentarResultadoComando("Bajar");

	}
	public void detener() {
		presentarResultadoComando("Detener");

	}
	public void reproducir() {
		presentarResultadoComando("Reproducir");

	}
	
	public void rebobinar() {
		presentarResultadoComando("Rebobinar");

	}
	public void avanzar() {
		presentarResultadoComando("Avanzar");

	}
	
	

	private void presentarResultadoComando(String comando) {
		String resultado = ejecutar(comando);
		System.out.println(resultado);
	}

}
