package org.danicv.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
	protected String nombre;
	protected String masa;
	protected String salsa;
	protected String queso;
	protected List<String> ingredientes;

	public PizzaProducto() {
		this.ingredientes = new ArrayList<>();
	}

	abstract public void cocinar();

	abstract public void cortar();

	public void preparar() {
		System.out.println("Preparando: " + nombre);
		System.out.println("Selecionanado la masa: " + masa);
		System.out.println("Agregando salsa: " + salsa);
		System.out.println("Agregando queso: " + queso);
		System.out.println("Agregando ingredientes: ");
		this.ingredientes.forEach(System.out::println);
	}

	public void empaquetar() {
		System.out.println("Colocando la pizza en una caja de empaque");
	}

	@Override
	public String toString() {
		return "PizzaProducto [nombre=" + nombre + ", masa=" + masa + ", salsa=" + salsa + ", queso=" + queso
				+ ", ingredientes=" + ingredientes + "]";
	}

	public String getNombre() {
		return nombre;
	}

}
