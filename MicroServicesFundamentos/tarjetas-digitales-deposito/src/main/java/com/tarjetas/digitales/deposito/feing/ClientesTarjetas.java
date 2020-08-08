package com.tarjetas.digitales.deposito.feing;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tarjetas.digitales.deposito.model.TarjetaMongo;

@FeignClient("TARJETA-DIGITALES-CLIENTES")
public interface ClientesTarjetas {
	
	@GetMapping("/api/v1/tarjeta")
	List<TarjetaMongo> buscarTarjetas();
	
	@GetMapping("/api/v1/tarjeta/numeroTarjeta/{numeroTarjeta}")
	public TarjetaMongo obtenerTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta);

	@GetMapping("/api/v1/tarjeta/nombreCliente/{nombreCliente}")
	public List<TarjetaMongo> obtenerTarjetasCliente(@PathVariable(name="nombreCliente") String nombreCliente);
	

}