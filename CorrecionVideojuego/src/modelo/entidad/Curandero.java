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
		int da�oTotal=0;
		if(this.getArma() instanceof Rezo) {
			da�oTotal = getArma().usar()+sabiduria;
			int curacion = (int) Math.round(da�oTotal*0.1);
			this.setHp(this.getHp()+curacion);
			System.out.println("Curandero se cura "+ curacion);
		}else {
			da�oTotal = getArma().usar();
		}
		
		da�oTotal += getNivel()*2;
		System.out.println("Curandero hace "+ da�oTotal);
		
		p.setHp(p.getHp() - da�oTotal);
		
	}
	
}
