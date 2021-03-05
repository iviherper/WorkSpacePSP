package modelo.entidad;

public class Hechizo extends Arma{
	private int porcenMagiaCaotica;
	@Override
	public int usar() {
		int dañoGeneral = super.usar();
		int numAle = Util.genNumero(1,100);
		if(numAle<=porcenMagiaCaotica) {
			System.out.println("Magia Caotica!");
			dañoGeneral = dañoGeneral*2;
		}
		
		return dañoGeneral;
	}

}
