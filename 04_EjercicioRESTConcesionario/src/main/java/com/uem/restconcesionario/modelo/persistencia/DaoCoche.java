package com.uem.restconcesionario.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uem.restconcesionario.modelo.entidad.Coche;

@Repository
public interface DaoCoche extends JpaRepository<Coche, Integer>{

	Optional<Coche> findByMatricula(String matricula);

}
