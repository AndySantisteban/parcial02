package com.santistebanostos_examen02.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.santistebanostos_examen02.entity.Socio;

public interface SocioService {
	public List<Socio> findAll(Pageable page);
	public List<Socio> finByNombre(String nombre,Pageable page);
	
	public Socio findById(int id);
	
	public Socio save(Socio articulo);
	public void delete(int id);
}
