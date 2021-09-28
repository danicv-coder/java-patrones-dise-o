package org.danicv.factory.ejemplos;

import org.danicv.factory.PizzaProducto;
import org.danicv.factory.PizzeriaCalifornia;
import org.danicv.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {

	public static void main(String[] args) {

		PizzeriaZonaAbstractFactory ny = new PizzeriaCalifornia();
		PizzeriaZonaAbstractFactory california = new PizzeriaCalifornia();

		PizzaProducto pizza = california.ordenarPizza("queso");
		System.out.println("Andrea ordeno la pizza: " + pizza.getNombre());
		
		pizza = california.ordenarPizza("vegetariana");
		System.out.println("Sofia ordeno la pizza de: " + pizza.getNombre());
		
		pizza = ny.ordenarPizza("italiana");
		System.out.println("Oswaldo ordeno la pizza: " + pizza.getNombre());
		
		pizza = ny.ordenarPizza("vegetariana");
		System.out.println("Pablo ordeno la pizza: " + pizza.getNombre());
		
		System.out.println("pizza: " + pizza);
	}

}
