package org.danicv.compositer;

import java.util.Objects;

abstract public class Componente {
	protected String nombre;

	public Componente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	abstract public String mostrar();

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Componente other = (Componente) obj;
		return Objects.equals(nombre, other.nombre);
	}

}
