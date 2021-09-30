package org.danicv.decorator;

import org.danicv.decorator.decorador.MayuscularDecorador;
import org.danicv.decorator.decorador.ReversaDecorador;
import org.danicv.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {

	public static void main(String[] args) {
		FormaTeable texto = new Texto("Hola! mi nombre es Daniel");
		MayuscularDecorador mayuscula = new MayuscularDecorador(texto);
		ReversaDecorador reversa = new ReversaDecorador(texto);
		ReversaDecorador reversaMayuscula = new ReversaDecorador(mayuscula);
		SubrayadoDecorador subTexto = new SubrayadoDecorador(texto);
		SubrayadoDecorador subMayuscula = new SubrayadoDecorador(reversaMayuscula);
		
		System.out.println(reversaMayuscula.darFormato());

	}

}
