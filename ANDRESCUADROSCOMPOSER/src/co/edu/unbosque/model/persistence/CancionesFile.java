package co.edu.unbosque.model.persistence;

import java.io.*;

import javax.swing.JFileChooser;

public class CancionesFile {

	private String archivocancion = "./data/cancion.txt";
	private Frases fa = new Frases();
	private Propiedades pr = new Propiedades();

	public String mostrarCancion() {
		String r = "";
		String[] p = new String[2];
		p = pr.leerProperties().split(",");
		int e = Integer.parseInt(p[0]);
		int fr = Integer.parseInt(p[1]);
		for (int i = 0; i < e; i++) {
			r += "\n";
			for (int v = 0; v < fr; v++) {
				r += fa.f1() + fa.f2() + fa.f3() + fa.f4() + fa.f5() + fa.f6() + "\n";
			}
		}
		return r;

	}

	public int escribirCancion() {
//		File f = new File(this.archivocancion);
		JFileChooser j = new JFileChooser("C:\\data");
		j.showSaveDialog(null);
		File f = j.getSelectedFile();
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(this.mostrarCancion());

			fw.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

	public String leer() {
		String linea = "";
		String cadena = "";
		File f = new File(this.archivocancion);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				cadena += linea + "\n";
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}

}
