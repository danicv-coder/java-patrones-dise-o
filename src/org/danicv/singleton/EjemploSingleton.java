package org.danicv.singleton;

public class EjemploSingleton {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			ConexionBDSingleton con = ConexionBDSingleton.getInstancia();
			System.out.println("Con: " + con);
		}

	}

}
