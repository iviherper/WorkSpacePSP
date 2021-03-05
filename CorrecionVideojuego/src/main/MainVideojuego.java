package main;

import modelo.entidad.Arma;
import modelo.entidad.Curandero;
import modelo.entidad.Espada;
import modelo.entidad.Guerrero;
import modelo.entidad.Personaje;
import modelo.entidad.Rezo;
import modelo.negocio.Arena;

public class MainVideojuego {
	public static void main(String[] args) {
		Personaje p1=new Guerrero();
		Arma espada = new Espada();
		Personaje p2 = new Curandero();
		Arma rezo = new Rezo();
		
		espada.setDañoMin(10);
		espada.setDañoMax(25);
		
		p1.setNombre("Conan");
		p1.setNivel(3);
		p1.setHp(150);
		p1.setIniciativa(5);
		p1.setArma(espada);
		
		espada.setDañoMin(5);
		espada.setDañoMax(20);
		
		p2.setNombre("Conan");
		p2.setNivel(5);
		p2.setHp(150);
		p2.setIniciativa(4);
		p2.setArma(rezo);
		
		Arena arena = new Arena(p1,p2);
		Personaje pg=arena.combate();
		
		System.out.println("Personaje ganador!!! "+ pg.getNombre());
	}
}
