package org.danicv.factory;

public class PizzeriaCaliforniaVegetariana extends PizzaProducto {

	public PizzeriaCaliforniaVegetariana() {
		super();
		nombre = "Pizza california vegetariana";
		masa = "Masa delgada light";
		salsa = "Salsa BBQ light";
		queso = "Queso mozalera";
		ingredientes.add("Aceitunas");
		ingredientes.add("Cebolla");
		ingredientes.add("Berenjena");
		ingredientes.add("Espinacas");
	}

	@Override
	public void cocinar() {
		System.out.println("Tiempo de cocinar 20min. A 90°C");

	}

	@Override
	public void cortar() {
		System.out.println("Cortar en pedazos grandes triangular");

	}

}
