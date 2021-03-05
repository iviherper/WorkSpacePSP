package modelo.entidad;

public class Hechizo extends Arma{
	private int porcenMagiaCaotica;
	@Override
	public int usar() {
		int daņoGeneral = super.usar();
		int numAle = Util.genNumero(1,100);
		if(numAle<=porcenMagiaCaotica) {
			System.out.println("Magia Caotica!");
			daņoGeneral = daņoGeneral*2;
		}
		
		return daņoGeneral;
	}

}
