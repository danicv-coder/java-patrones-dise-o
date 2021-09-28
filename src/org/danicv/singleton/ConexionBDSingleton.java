package org.danicv.singleton;

public class ConexionBDSingleton {

	private static ConexionBDSingleton instancia;

	private ConexionBDSingleton() {
		System.out.println("Conectando a un motor de base de datos...");
	}

	public static ConexionBDSingleton getInstancia() {
		if (instancia == null) {
			instancia = new ConexionBDSingleton();
		}
		return instancia;
	}
}
