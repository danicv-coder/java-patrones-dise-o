package org.danicv.factory;

public class PizzeriaCalifornia extends PizzeriaZonaAbstractFactory {

	@Override
	PizzaProducto crearPizza(String tipo) {
		PizzaProducto producto = null;
		switch (tipo) {
		case "queso":
			producto = new PizzaCaliforniaQueso();
			break;

		case "Vegetariana":
			producto = new PizzeriaCaliforniaVegetariana();
			break;
		}
		return producto;
	}

}
