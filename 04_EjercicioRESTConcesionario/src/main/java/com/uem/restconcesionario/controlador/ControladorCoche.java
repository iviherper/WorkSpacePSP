package com.uem.restconcesionario.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uem.restconcesionario.modelo.entidad.Coche;
import com.uem.restconcesionario.modelo.negocio.GestorCoches;

@RestController
public class ControladorCoche {
	@Autowired
	private GestorCoches gc;
	
	@GetMapping("coches")
	public ResponseEntity<List<Coche>> listar(){
		List<Coche> lista = gc.listar();
		ResponseEntity<List<Coche>> re = new ResponseEntity<List<Coche>>(lista, HttpStatus.OK);
		return re;
	}
	
	@GetMapping("coches/{id}")
	public ResponseEntity<Coche> obtener(@PathVariable("id") int id){
		Coche c = gc.obtener(id);
		HttpStatus codigoRespuesta = null;
		if(c != null) {
			codigoRespuesta = HttpStatus.OK;
		}else {
			codigoRespuesta = HttpStatus.NOT_FOUND;
		}
		ResponseEntity<Coche> re = new ResponseEntity<Coche>(c, codigoRespuesta);
		return re;
		}
	
	@PostMapping("coches")
	public ResponseEntity<Coche> alta(@RequestBody Coche c){
		Coche coche = gc.alta(c);
		HttpStatus status= null;
		if(c != null) {
			status = HttpStatus.CREATED;
		}else {
			status = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Coche> re = new ResponseEntity<Coche>(c,status);
		return re;
	}
	
	@PutMapping("coches/{id}")
	public ResponseEntity<Coche> modificar(@RequestBody Coche coche, @PathVariable("id") int id){
		coche.setId(id);
		Coche c = gc.modificar(coche);
		HttpStatus status= null;
		if(c != null) {
			status = HttpStatus.OK;
		}else {
			status = HttpStatus.BAD_GATEWAY;
		}
		ResponseEntity<Coche> re = new ResponseEntity<Coche>(c,status);
		return re;
	}
	
	@DeleteMapping("coches/{id}")
	public ResponseEntity<Integer> baja(@PathVariable("id") int id){
		HttpStatus status= null;
		Boolean borrar = gc.baja(id);
		if(borrar) {			
			status = HttpStatus.OK;
		}else {
			status = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Integer> re = new ResponseEntity<Integer>(id,status);
		return re;
	}
} 
