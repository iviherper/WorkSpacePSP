package com.uem.concesionarioresttemplate.modelo.proxy;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uem.concesionarioresttemplate.modelo.entidad.Coche;


@Service
public class CocheProxy {
	public static final String URL_PERSONAS = "http://localhost:8090/coches";
	
	public List<Coche> listar(){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Coche[]> coches = restTemplate.getForEntity(URL_PERSONAS, Coche[].class);
		List<Coche> coche = Arrays.asList(coches.getBody());
		return coche;		
	}
	
	public Coche obtener(int id){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Coche> coche = restTemplate.getForEntity(URL_PERSONAS+"/"+id, Coche.class);
		Coche c = coche.getBody();
		return c;		
	}
	
	public Coche alta(Coche c) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<Coche>(c);
		Coche response = restTemplate.postForObject(URL_PERSONAS, requestBody, Coche.class);
		return response;
	}
	
	public Coche modificar(Coche c) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<Coche>(c);
		ResponseEntity<Coche> coche = restTemplate.exchange(URL_PERSONAS+"/"+c.getId(), HttpMethod.PUT, requestBody, Coche.class);
		return coche.getBody();
	}

	public void borrar(int id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(URL_PERSONAS+"/"+id);
	}

}
