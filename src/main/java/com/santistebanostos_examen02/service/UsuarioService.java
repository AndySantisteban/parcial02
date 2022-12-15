package com.santistebanostos_examen02.service;

import com.santistebanostos_examen02.dtos.LoginRequestDTO;
import com.santistebanostos_examen02.dtos.LoginResponseDTO;
import com.santistebanostos_examen02.entity.Usuario;


public interface UsuarioService {
	public Usuario create(Usuario usuario);
	public LoginResponseDTO login(LoginRequestDTO request);
	public String createToken(Usuario usuario) ;
	public boolean validateToken(String token);
	public String getUserFromToken(String jwt);
}