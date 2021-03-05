package JavaBean;

import java.util.ArrayList;

public class MainJavaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Direccion d1 = new Direccion();
		
		p1.setNombre("Goku");
		p1.setEdad(40);
		p1.setAltura(1.73);
		p1.setDireccion(d1);
		d1.setCiudad("Namek");
		p1.getDireccion().setCp("28224");
		System.out.println(p1.getDireccion().getCiudad());
		System.out.println(d1.getCp());
		p1.setDireccion(new Direccion());
		p1.getDireccion().setCiudad("pepe");
		System.out.println(d1.getCiudad());
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		Persona p2 = new Persona();
		p2.setNombre("Krilin");
		listaPersona.add(p2);
		System.out.println(listaPersona.toString());		
	}

}
