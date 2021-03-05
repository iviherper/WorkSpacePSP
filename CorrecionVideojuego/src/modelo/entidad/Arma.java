package modelo.entidad;

public abstract class Arma {
	private int dañoMin;
	private int dañoMax;
	private String tipo;
	
	public int usar() {
		int dañoCausado = Util.genNumero(dañoMin,dañoMax);
		return dañoCausado;
	}
	
	public int getDañoMin() {
		return dañoMin;
	}
	public void setDañoMin(int dañoMin) {
		this.dañoMin = dañoMin;
	}
	public int getDañoMax() {
		return dañoMax;
	}
	public void setDañoMax(int dañoMax) {
		this.dañoMax = dañoMax;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
