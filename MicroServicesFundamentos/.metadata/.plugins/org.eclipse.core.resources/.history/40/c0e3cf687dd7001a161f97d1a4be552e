package com.tarjetas.digitales.clientes.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Tarjeta")
public class TarjetaMongo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private String nombreTitular;
	private String nombreEntidad;
	private String numeroTarjeta;
	private String cvv;
	private String fechaCaudicidad;
	private String marca;
	
	
	

}
