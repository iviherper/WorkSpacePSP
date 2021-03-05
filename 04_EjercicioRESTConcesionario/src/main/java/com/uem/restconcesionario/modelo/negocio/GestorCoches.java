package com.uem.restconcesionario.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uem.restconcesionario.modelo.entidad.Coche;
import com.uem.restconcesionario.modelo.persistencia.DaoCoche;

@Service
public class GestorCoches {
	@Autowired
	private DaoCoche daoCoche;
	
	public List<Coche> listar(){
		List<Coche> lista = daoCoche.findAll();
		return lista;
	}
	
	public Coche obtener(int id) {
		Optional<Coche> opt = daoCoche.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}
	}
	
	public Coche alta(Coche c) {
		if(c.getPotencia()<0 || daoCoche.findByMatricula(c.getMatricula()).isPresent()) {
			return null;
		}
		Coche coche = daoCoche.save(c);
		return coche;
	}
	
	public Coche modificar(Coche c) {
		if(c.getPotencia()<0) {
			return null;
		}
		Coche coche = daoCoche.save(c);
		return coche;
	}
	
	public boolean baja(int id) {
		if(daoCoche.findById(id).isPresent()) {
			daoCoche.deleteById(id);
			return true;
		}
		return false;		
	}
}
