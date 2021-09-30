package org.danicv.decorator2;

public class Cafe implements Configurable {
	private float precio;
	private String nombre;

	public Cafe(float precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public float precioBase() {
		return this.precio;
	}

	@Override
	public String ingrediente() {
		return this.nombre;
	}

}
