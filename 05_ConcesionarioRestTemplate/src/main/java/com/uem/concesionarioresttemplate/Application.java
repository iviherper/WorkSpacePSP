package com.uem.concesionarioresttemplate;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.uem.concesionarioresttemplate.modelo.entidad.Coche;
import com.uem.concesionarioresttemplate.modelo.proxy.CocheProxy;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CocheProxy pCoche = context.getBean(CocheProxy.class);
		
		System.out.println(pCoche.listar());
		Coche c2 = pCoche.obtener(3);
		System.out.println(c2);
		
		Coche c1 = new Coche("7416DWH","Ford","CMax",90);
		 
		System.out.println(pCoche.alta(c1));
		
		c2.setPotencia(130);
		System.out.println(pCoche.modificar(c2));
		
		//pCoche.borrar(6);
		System.out.println(pCoche.listar());
	}

}
