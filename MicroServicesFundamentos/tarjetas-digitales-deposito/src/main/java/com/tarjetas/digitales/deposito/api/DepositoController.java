package com.tarjetas.digitales.deposito.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tarjetas.digitales.deposito.feing.ClientesTarjetas;
import com.tarjetas.digitales.deposito.model.TarjetaMongo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DepositoController {

	@Autowired
	private ClientesTarjetas cliente;

	@GetMapping("/depositar")
	public List<TarjetaMongo> depositar() {
		log.info("Realizar Deposito::::::: ");
		return cliente.buscarTarjetas();
	}
	
	
	@GetMapping("/numeroTarjeta/{numeroTarjeta}")
	public TarjetaMongo obtenerTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		
		return cliente.obtenerTarjeta(numeroTarjeta);		
	}

	@GetMapping("/nombreCliente/{nombreCliente}")
	public List<TarjetaMongo> obtenerTarjetasCliente(@PathVariable(name="nombreCliente") String nombreCliente){
		return cliente.obtenerTarjetasCliente(nombreCliente);
	}

}