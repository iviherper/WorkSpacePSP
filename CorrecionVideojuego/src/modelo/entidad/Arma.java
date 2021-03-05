package modelo.entidad;

public abstract class Arma {
	private int da�oMin;
	private int da�oMax;
	private String tipo;
	
	public int usar() {
		int da�oCausado = Util.genNumero(da�oMin,da�oMax);
		return da�oCausado;
	}
	
	public int getDa�oMin() {
		return da�oMin;
	}
	public void setDa�oMin(int da�oMin) {
		this.da�oMin = da�oMin;
	}
	public int getDa�oMax() {
		return da�oMax;
	}
	public void setDa�oMax(int da�oMax) {
		this.da�oMax = da�oMax;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
