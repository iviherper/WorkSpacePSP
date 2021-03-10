package com.uem.ejerciciohashlogin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uem.ejerciciohashlogin.entidad.Cliente;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		LoginRepository repository = SpringApplication.run(Application.class, args).getBean(LoginRepository.class);
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {

			String usuario = "";
			String password = "";
			System.out.println("Introduce una opción:");
			System.out.println("1- Alta usuario");
			System.out.println("2- Login usuario");
			System.out.println("0- Salir");
			int opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Introduce el nombre de usuario");
				usuario = sc.nextLine();
				System.out.println("Introduce la pass");
				password = sc.nextLine();
				Cliente cli = repository.findByUsuario(usuario);
				if (cli != null) {
					System.out.println("El usuario introducido ya existe");
				} else {
					Cliente cliente = new Cliente();
					cliente.setUsuario(usuario);
					byte[] contrasena =password.getBytes();
					try {
			            MessageDigest md = MessageDigest.getInstance("SHA-512");
			            md.update(contrasena);
			            byte[] contrasenahasheada = md.digest();
			            String passwordhash = Base64.getEncoder().encodeToString(contrasenahasheada);
			            cliente.setPass(passwordhash);
			        } catch (NoSuchAlgorithmException e) {
			            e.printStackTrace();
			        }
					repository.save(cliente);
					System.out.println("Dado de alta correctamente a "+cliente.getUsuario());
				}
				break;
			case 2:
				System.out.println("Introduce el nombre de usuario");
				usuario = sc.nextLine();
				System.out.println("Introduce la pass");
				password = sc.nextLine();
				String passhash="";
				byte[] contrasena =password.getBytes();
				try {
		            MessageDigest md = MessageDigest.getInstance("SHA-512");
		            md.update(contrasena);
		            byte[] contrasenahasheada = md.digest();
		            passhash = Base64.getEncoder().encodeToString(contrasenahasheada);
		        } catch (NoSuchAlgorithmException e) {
		            e.printStackTrace();
		        }
				Cliente cli2 = repository.findByUsuario(usuario);
				if (cli2 != null) {
					if (cli2.getPass().equals(passhash)) {
						System.out.println("Usuario y password correctos");
					} else {
						System.out.println("Datos incorrectos");
					}
				}else {
					System.out.println("El usuario no existe");
				}
				break;
			case 0:
				continuar = false;
				System.out.println("Has salido del menu");
				break;
			default:
				System.out.println("Tienes que introducir una opcion correcta");
				break;
			}
		}
	}

}
