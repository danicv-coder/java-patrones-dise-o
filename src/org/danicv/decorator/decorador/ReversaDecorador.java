package org.danicv.decorator.decorador;

import org.danicv.decorator.FormaTeable;

public class ReversaDecorador extends TextoDecorador {

	public ReversaDecorador(FormaTeable texto) {
		super(texto);

	}

	@Override
	public String darFormato() {
		StringBuilder sb = new StringBuilder(texto.darFormato());
		return sb.reverse().toString();
	}

}
