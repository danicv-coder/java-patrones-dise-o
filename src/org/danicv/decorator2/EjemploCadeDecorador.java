package org.danicv.decorator2;

import org.danicv.decorator2.decorador.ConChocolateDecorador;
import org.danicv.decorator2.decorador.ConCremaDecorador;
import org.danicv.decorator2.decorador.ConLecheDecorador;

public class EjemploCadeDecorador {

	public static void main(String[] args) {
		Configurable cafe = new Cafe(7, "Cafe Mocha");
		ConChocolateDecorador cholocalate = new ConChocolateDecorador(cafe);
		ConCremaDecorador crema = new ConCremaDecorador(cholocalate);
		ConLecheDecorador leche =  new ConLecheDecorador(crema);
		
		System.out.println("El precio del cafe mocha es: " + cholocalate.precioBase());
		System.out.println("Los ingredientes: ");

	}

}
