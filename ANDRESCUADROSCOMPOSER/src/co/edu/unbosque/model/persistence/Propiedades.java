package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	private Properties prop = new Properties();
	private String archivprop = "./data/archivopropiedades.txt";

	public int escribirProperties() {
		try {
			prop.setProperty("estrofas", "3");
			prop.setProperty("frases", "4");
			prop.store(new FileOutputStream(archivprop), archivprop);
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

	public String leerProperties() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivprop));
			prop.list(System.out);
			linea += prop.getProperty("estrofas");
			linea += "," + prop.getProperty("frases");
		} catch (IOException e) {
			return null;

		}
		return linea;
	}

}
