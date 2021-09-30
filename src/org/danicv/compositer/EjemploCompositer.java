package org.danicv.compositer;

public class EjemploCompositer {

	public static void main(String[] args) {
		Directorio doc = new Directorio("Documentos");
		Directorio java = new Directorio("Java");

		java.addComponente(new Archivo("patron-compositer.docx"));
		Directorio stream = new Directorio("Api-stream");
		stream.addComponente(new Archivo("stream-map.docx"));

		java.addComponente(stream);

		doc.addComponente(java);
		doc.addComponente(new Archivo("cv.pdf"));
		doc.addComponente(new Archivo("logo.jpg"));
		
		System.out.println(doc.mostrar());
	}

}
