package com.santistebanostos_examen02.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santistebanostos_examen02.entity.*;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	public Optional<Usuario> findByEmail(String email);
}