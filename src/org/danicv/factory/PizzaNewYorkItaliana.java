package org.danicv.factory;

public class PizzaNewYorkItaliana extends PizzaProducto {

	public PizzaNewYorkItaliana() {
		super();
		nombre = "Pizza Italina New York";
		masa = "Masa fina";
		salsa = "Salsa filet";
		queso = "Queso Cremoso";
		ingredientes.add("Napolitana");
		ingredientes.add("Doble queso");
		ingredientes.add("Monroe");
		ingredientes.add("Tomate");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando la pizza en 30 min. a 50°C");
	}

	@Override
	public void cortar() {
		System.out.println("Cortar la pizza en retangular");

	}

}
