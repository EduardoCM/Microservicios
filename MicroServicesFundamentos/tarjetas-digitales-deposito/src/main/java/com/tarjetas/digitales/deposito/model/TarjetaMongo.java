package com.tarjetas.digitales.deposito.model;

import java.io.Serializable;

import lombok.Data;


@Data
public class TarjetaMongo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nombreTitular;
	private String nombreEntidad;
	private String numeroTarjeta;
	private String cvv;
	private String fechaCaudicidad;
	private String marca;
	
	
	

}
