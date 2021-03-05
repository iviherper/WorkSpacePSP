import java.util.Random;

public class Arco extends Arma{

	@Override
	public void usar() {
		System.out.println("chiuuuu");
		Random rm = new Random();
		int dañoVariable = rm.nextInt(10);
		int dañoTotal = getDaño() + dañoVariable;
		System.out.println("Tipo: " + getTipo() + " daño: " + dañoTotal);
	}
	
}
