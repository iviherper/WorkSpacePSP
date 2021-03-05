package modelo.entidad;

public class Curandero extends Personaje{
	private int sabiduria;
	public int getSabiduria() {
		return sabiduria;
	}
	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}
	@Override
	public void atacar(Personaje p) {
		int dañoTotal=0;
		if(this.getArma() instanceof Rezo) {
			dañoTotal = getArma().usar()+sabiduria;
			int curacion = (int) Math.round(dañoTotal*0.1);
			this.setHp(this.getHp()+curacion);
			System.out.println("Curandero se cura "+ curacion);
		}else {
			dañoTotal = getArma().usar();
		}
		
		dañoTotal += getNivel()*2;
		System.out.println("Curandero hace "+ dañoTotal);
		
		p.setHp(p.getHp() - dañoTotal);
		
	}
	
}
