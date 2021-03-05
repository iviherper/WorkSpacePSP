package com.example.demo.modelo.entidad;

public class Videojuego {
	private int id, precio;
	private String compania, nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Videojuego(int id, int precio, String compania, String nombre) {
		super();
		this.id = id;
		this.precio = precio;
		this.compania = compania;
		this.nombre = nombre;
	}
	
}
