package org.danicv.decorator2.decorador;

import org.danicv.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{

	public ConChocolateDecorador(Configurable cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float precioBase() {
		// TODO Auto-generated method stub
		return cafe.precioBase() + 5f;
	}

	@Override
	public String ingrediente() {
		
		return cafe.ingrediente() + "Chocolate";
	}
	
}
