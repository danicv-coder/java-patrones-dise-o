package org.danicv.decorator2.decorador;

import org.danicv.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador {

	public ConLecheDecorador(Configurable cafe) {
		super(cafe);
	}

	@Override
	public float precioBase() {
		
		return cafe.precioBase() + 8.5f;
	}

	@Override
	public String ingrediente() {
		
		return cafe.ingrediente() + ", leche";
	}

}
