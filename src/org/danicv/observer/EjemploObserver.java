package org.danicv.observer;

public class EjemploObserver {
	public static void main(String[] args) {
		Corporacion google = new Corporacion("Google", 1000);
		google.addObserver(observable -> {
			System.out.println("John: " + observable);
		});

		google.addObserver(observable -> {
			System.out.println("Andres: " + observable);
		});

		google.addObserver(observable -> {
			System.out.println("Daniel: " + observable);
		});

		google.modificarPrecio(2000);
	}
}
