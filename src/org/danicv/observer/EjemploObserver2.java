package org.danicv.observer;

public class EjemploObserver2 {

	public static void main(String[] args) {
		UsuarioRepositorio repo = new UsuarioRepositorio();
		repo.addObserver(o -> System.out.println("Enviando un email al usuario"));
		repo.addObserver(o -> System.out.println("Enviando un email al administrador"));
		repo.addObserver(o -> System.out.println("Guardando info del usuario al long"));
		repo.crearUsuario("Andrés");

	}

}
