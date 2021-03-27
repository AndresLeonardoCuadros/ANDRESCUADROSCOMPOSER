package co.edu.unbosque.controller;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;
import java.io.*;

public class Controller {

	private View v = new View();
	private Mundo m = new Mundo();

	public Controller() {
		v.mostrar(m.gestionarPropiedades());
		v.mostrar(m.gestionarArchivo());
		m.guardarArchivo();

	}

}
