package org.danicv.factory;

public class PizzaCaliforniaQueso extends PizzaProducto {
	public PizzaCaliforniaQueso() {
		super();
		nombre = "Pizza california queso";
		masa = "Masa a la piedra delgada";
		salsa = "Salsa de tomate rucula";
		queso = "Queso mozarella";
		ingredientes.add("Cebolla");
		ingredientes.add("Queso azul");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando a 35min. a 100°C");

	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en pequeños triangulos");

	}

}
