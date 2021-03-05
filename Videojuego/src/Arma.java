
public abstract class Arma {
	private int daño;
	private String tipo;
	
	
	public int getDaño() {
		return daño;
	}


	public void setDaño(int daño) {
		this.daño = daño;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public abstract void usar();
}
