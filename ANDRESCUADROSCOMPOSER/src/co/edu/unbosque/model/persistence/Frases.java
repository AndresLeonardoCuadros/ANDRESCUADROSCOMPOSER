package co.edu.unbosque.model.persistence;

public class Frases {

	private String[] f1 = new String[4];
	private String[] f2 = new String[4];
	private String[] f3 = new String[4];
	private String[] f4 = new String[4];
	private String[] f5 = new String[4];
	private String[] f6 = new String[4];

	public Frases() {
		f1[0] = "Mami ";
		f1[1] = "Bebe ";
		f1[2] = "Princess ";
		f1[3] = "Mami ";

		f2[0] = "yo quiero ";
		f2[1] = "yo puedo ";
		f2[2] = "yo vengo a ";
		f2[3] = "voy a ";

		f3[0] = "encenderte ";
		f3[1] = "amarte ";
		f3[2] = "ligar ";
		f3[3] = "jugar ";

		f4[0] = "suave ";
		f4[1] = "lento ";
		f4[2] = "rapido ";
		f4[3] = "fuerte ";

		f5[0] = "hasta que salga el sol ";
		f5[1] = "toda la noche ";
		f5[2] = "hasta el amanecer ";
		f5[3] = "todo el día ";

		f6[0] = "sin anestesia ";
		f6[1] = "sin compromiso ";
		f6[2] = "feis to feis ";
		f6[3] = "sin miedo ";
	}

	public String f1() {
		String f = "";
		int r = (int) (Math.random() * (0 - 3) + 3);
		f += f1[r];
		return f;
	}

	public String f2() {
		String f = "";
		int r = (int) (Math.random() * (0 - 3) + 3);
		f += f2[r];
		return f;
	}

	public String f3() {
		String f = "";
		int r = (int) (Math.random() * (0 - 3) + 3);
		f += f3[r];
		return f;
	}

	public String f4() {
		String f = "";
		int r = (int) (Math.random() * (0 - 3) + 3);
		f += f4[r];
		return f;
	}

	public String f5() {
		String f = "";
		int r = (int) (Math.random() * (0 - 3) + 3);
		f += f5[r];
		return f;
	}

	public String f6() {
		String f = "";
		int r = (int) (Math.random() * (0 - 3) + 3);
		f += f6[r];
		return f;
	}

}
