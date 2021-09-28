package org.danicv.factory;

abstract public class PizzeriaZonaAbstractFactory {

	public PizzaProducto ordenarPizza(String tipo) {
		PizzaProducto pizza = crearPizza(tipo);
		System.out.println("------ FRABRICANDO LA PIZZA " + pizza.getNombre() + "------");
		pizza.preparar();
		pizza.cocinar();
		pizza.cortar();
		pizza.empaquetar();
		
		return pizza;
	}

	abstract PizzaProducto crearPizza(String tipo);
}
