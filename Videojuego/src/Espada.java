
public class Espada extends Arma{
	private int da�o;
	private String tipo;
	
	public void usar() {
		System.out.println("Swannnnnggg");
		System.out.println("Tipo: "+ tipo + " da�o: " + da�o);
	}
	
	public int getDa�o() {
		return da�o;
	}
	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
