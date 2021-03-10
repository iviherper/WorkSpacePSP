package com.uem.ejerciciohashlogin;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uem.ejerciciohashlogin.entidad.Cliente;

public interface LoginRepository extends CrudRepository<Cliente, Integer> {
	Cliente findByUsuario(String usuario);
}
