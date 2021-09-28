package org.danicv.factory;

public class PizzaNewYorkPepperoni extends PizzaProducto {

	public PizzaNewYorkPepperoni() {
		super();
		nombre = "Pizza New York de Pepproni";
		masa = "Masa palermo";
		salsa = "Salsa para pizza";
		queso = "Queso Cremoso";
		ingredientes.add("Pepperoni");
		ingredientes.add("oregano");
		ingredientes.add("picante");

	}

	@Override
	public void cocinar() {
		System.out.println("Tiempo en el horno 20min. a 90°C");

	}

	@Override
	public void cortar() {
		System.out.println("Cortar en dos partes");

	}

}
