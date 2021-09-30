package org.danicv.decorator.decorador;

import org.danicv.decorator.FormaTeable;

public class SubrayadoDecorador extends TextoDecorador {

	public SubrayadoDecorador(FormaTeable texto) {
		super(texto);
	}

	@Override
	public String darFormato() {
		int largo = texto.darFormato().length();
		StringBuilder sb = new StringBuilder(texto.darFormato());
		for (int i = 0; i < largo; i++) {
			sb.append("_");
		}
		return sb.toString();
	}

}
