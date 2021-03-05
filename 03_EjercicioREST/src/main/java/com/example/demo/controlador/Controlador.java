package com.example.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.entidad.Videojuego;

@RestController
public class Controlador {
	Videojuego v = new Videojuego(1,20,"Riot","League of Legends");
	
	@GetMapping("videojuego")
	public Videojuego mostrarVideojuego() {
		return v;
	}
	
	@PutMapping("videojuego")
	public Videojuego editarPrecio() {
		v.setPrecio(v.getPrecio()+10);
		System.out.println("Se ha incrementado 10€ en el precio del videojuego");
		return v;
	}
	
}
