package modelo.negocio;

import java.util.Scanner;

import modelo.entidad.Personaje;

public class Arena {
	private Personaje p1;
	private Personaje p2;
	
	public Arena(Personaje p1, Personaje p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	/**
	 * 
	 * @return personaje ganador
	 */
	public Personaje combate() {
		Personaje ganador=null;
		boolean acabado = false;
		
		Personaje pi = null;
		Personaje pf = null;
		
		if(p1.getIniciativa()>= p2.getIniciativa()) {
			pi=p1;
			pf=p2;
		}
		else{
			pi=p2;
			pf=p2;
		}
		System.out.println("Inicia Combate: "+pi.getNombre());
		Scanner sc = new Scanner(System.in);
		do {
			pi.atacar(pf);
			if(pf.getHp()<=0) {
				return pf;
			}
			pf.atacar(pi);
			if(pi.getHp()<=0) {
				return pi;
			}
			System.out.println("Puntos de vida de "+pi.getNombre());
			System.out.println(pi.getHp());
			System.out.println("Puntos de vida de "+pf.getNombre());
			System.out.println(pf.getHp());
			System.out.println("Turno pasado, pulse Enter");
			sc.nextLine();
		}while(true);
	}
	
}
