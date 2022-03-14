package com.estrategit.curso.interfacescontrolflujo;

public class Interruptor implements InterfaceEjecutable {

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

	private void presentarResultadoComando(String comando) {
		String resultado = ejecutar(comando);
		System.out.println(resultado);
	}


	

}
