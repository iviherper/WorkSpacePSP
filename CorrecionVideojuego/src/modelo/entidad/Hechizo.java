package modelo.entidad;

public class Hechizo extends Arma{
	private int porcenMagiaCaotica;
	@Override
	public int usar() {
		int da�oGeneral = super.usar();
		int numAle = Util.genNumero(1,100);
		if(numAle<=porcenMagiaCaotica) {
			System.out.println("Magia Caotica!");
			da�oGeneral = da�oGeneral*2;
		}
		
		return da�oGeneral;
	}

}
