package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CancionesFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Mundo {

	public String gestionarArchivo() {
		CancionesFile archivo = new CancionesFile();
		return "La letra es esta: \n" + archivo.mostrarCancion();
	}

	public String guardarArchivo() {
		CancionesFile archivo = new CancionesFile();
		System.out.print(archivo.escribirCancion());
		return "La letra es esta: \n" + archivo.leer();
	}

	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		System.out.print(prop.escribirProperties());
		return "La canción tendra estas propiedades: \n" + "estrofas, frases: " + prop.leerProperties();
	}

}
