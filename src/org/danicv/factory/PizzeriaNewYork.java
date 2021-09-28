package org.danicv.factory;

public class PizzeriaNewYork extends PizzeriaZonaAbstractFactory {

	@Override
	PizzaProducto crearPizza(String tipo) {
		PizzaProducto producto = null;
		switch (tipo) {
		case "vegetariana":
			producto = new PizzaNewYorkVegetariana();
			break;

		case "pepperoni":
			producto = new PizzaNewYorkPepperoni();
			break;

		case "italiana":
			producto = new PizzaNewYorkItaliana();
			break;
		}
		return producto;
	}

}
