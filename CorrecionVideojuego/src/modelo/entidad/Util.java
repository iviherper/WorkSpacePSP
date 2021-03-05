package modelo.entidad;

import java.util.concurrent.ThreadLocalRandom;

public class Util {
	public static int genNumero(int ranA, int ranB) {
		int numero = ThreadLocalRandom.current().nextInt(ranA,ranB);
		return numero;
	}
}
