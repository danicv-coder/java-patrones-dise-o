package org.danicv.decorator2.decorador;

import org.danicv.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador {

	public ConCremaDecorador(Configurable cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float precioBase() {

		return cafe.precioBase() + 3f;
	}

	@Override
	public String ingrediente() {
		
		return cafe.ingrediente() + "crema";
	}
	
}
