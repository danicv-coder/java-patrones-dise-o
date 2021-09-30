package org.danicv.decorator.decorador;

import org.danicv.decorator.FormaTeable;

public class MayuscularDecorador extends TextoDecorador {

	public MayuscularDecorador(FormaTeable texto) {
		super(texto); 
	}

	@Override
	public String darFormato() {
		
		return texto.darFormato().toUpperCase();
	}

}
