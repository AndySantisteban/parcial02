package com.santistebanostos_examen02.validators;

import com.santistebanostos_examen02.entity.Usuario;
import com.santistebanostos_examen02.exceptions.ValidateServiceException;

public class UsuarioValidator {
	public static void save(Usuario usuario) {
		if(usuario.getEmail()==null || usuario.getEmail().trim().isEmpty()) {
			throw new ValidateServiceException("El email es requerido");
		}
		if(usuario.getPassword()==null || usuario.getPassword().trim().isEmpty()) {
			throw new ValidateServiceException("El password es requerido");
		}
	}
}
