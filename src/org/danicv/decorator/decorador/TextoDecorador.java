package org.danicv.decorator.decorador;

import org.danicv.decorator.FormaTeable;

abstract public class TextoDecorador implements FormaTeable {

	protected FormaTeable texto;

	public TextoDecorador(FormaTeable texto) {
		this.texto = texto;
	}

}
