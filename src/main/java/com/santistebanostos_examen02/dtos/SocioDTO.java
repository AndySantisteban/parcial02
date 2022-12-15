package com.santistebanostos_examen02.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SocioDTO {
	private int id;
	private String nombre;
	private String apellidos;
	private String documento;
	private String telefono;
	private String email;	
	private boolean habilitado;
}
