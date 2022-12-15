package com.santistebanostos_examen02.validators;


import com.santistebanostos_examen02.entity.Socio;
import com.santistebanostos_examen02.exceptions.*;

public class SocioValidator {
	public static void save(Socio socio) {
		if (socio.getNombre() == null || socio.getNombre().trim().isEmpty()) {
			throw new ValidateServiceException("El nombre es requirido");
		}
		if (socio.getNombre().length() > 100 ) {
			throw new ValidateServiceException("El nombre es muy largo (máximo 100 caracteres)");
		}
		if (socio.getDocumento() == null || socio.getDocumento().trim().isEmpty()) {
			throw new ValidateServiceException("El documento es requirido");
		}
		if (socio.getEmail() == null || socio.getEmail().trim().isEmpty()) {
			throw new ValidateServiceException("El email es requirido");
		}
	}
}
