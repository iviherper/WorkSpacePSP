
public class Guerrero {
	private String nombre;
	private Arma arma;
	
	public void atacar() {
		System.out.println("Arggggg!!");
		arma.usar();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma e1) {
		this.arma = e1;
	}
	
}
