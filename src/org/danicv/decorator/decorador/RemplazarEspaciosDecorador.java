package org.danicv.decorator.decorador;

import org.danicv.decorator.FormaTeable;

public class RemplazarEspaciosDecorador extends TextoDecorador {

	public RemplazarEspaciosDecorador(FormaTeable texto) {
		super(texto);
	}

	@Override
	public String darFormato() {
		return texto.darFormato().replace(" ", "_");
	}

}
