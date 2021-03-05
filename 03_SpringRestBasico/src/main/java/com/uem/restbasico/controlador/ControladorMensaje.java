package com.uem.restbasico.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uem.restbasico.modelo.entidad.Persona;

//Esta clase servirá como punto de entrada de nuestro servvicio REST
//para ello debemos de crear un objeto que sea gestionado por Spiing
//para que reciba las peticiones

//para dar de alta un objeto utilizaremos la siguiente anotacion
@RestController
public class ControladorMensaje {
	private String mensaje = "Esto es un mensaje de prueba";
	//Los metodos de esta clase, gracias a la anotacion restcontroller, nos
	//serviran a partir de ahora para recibir peticiones http de nuestros
	//clientes (que pueden ser perfectamente un navegador web)
	
	//Con esto lo que estamos haciendo es mapear el recurso "mensaje" con el
	//metodo http GET. La url completa sería "localhost:8080/mensaje"
	@GetMapping("mensaje")
	public String obtenerMensaje() {
		//podemos simular un error de servidor (codigo 500)
//		String s = null;
//		s.toLowerCase();
		return mensaje;
	}
	
	//Podemos mapear todos los recursos que queramos con el metodo http que queramos
	//Dentro de la etiqueta podemos poner el parametro "produces" que le estaremos indicando 
	//el mime type que tenemos que poner en nuestra cabecera "content-type" de nuestro http response, 
	//y que sera leido por nuestro cliente e interpretado a su manera. si ponemos el mime type como 
	//text/html entonces el navegador leera el body como un html, y si ponemos text/plain entonces 
	//lo interpretará como un texto plano
	@GetMapping(value="mensajehtml", produces = "text/html")
	public String obtenerMensajeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head>");
		buffer.append("<title>Pagina GET</title></head><body>");
		buffer.append("<h1>Esto seria un mensaje en HTML</h1>");
		buffer.append("</body></head></html>");
		
		return buffer.toString();
	}
	
	@GetMapping("persona")
	public Persona obtenerPersona() {
		Persona p1 = new Persona();
		p1.setEdad(34);
		p1.setNombre("Ivan");
		return p1;
		//los objetos por defecto se mandan en notacion json
	}
	
	//Cuando alguien me ponga el recurso mensaje con el metodo put entrara en accion este metodo
	@PutMapping("mensaje")
	public String modificarMensaje() {
		mensaje = "he modificado el mensaje";
		return "OK";
	}
}
