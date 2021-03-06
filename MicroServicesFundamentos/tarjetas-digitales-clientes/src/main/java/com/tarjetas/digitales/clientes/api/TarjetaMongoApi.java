package com.tarjetas.digitales.clientes.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tarjetas.digitales.clientes.model.TarjetaMongo;
import com.tarjetas.digitales.clientes.repository.TarjetaRepositoryMongo;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1/tarjeta")
public class TarjetaMongoApi {
	
	@Autowired
	private TarjetaRepositoryMongo tarjetaRepository;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TarjetaMongo creartarjeta(@RequestBody TarjetaMongo tarjeta) {
		return tarjetaRepository.save(tarjeta);	
	}
	
	@GetMapping("/numeroTarjeta/{numeroTarjeta}")
	public TarjetaMongo obtenerTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		return tarjetaRepository.findByNumeroTarjeta(numeroTarjeta);		
	}

	@GetMapping("/nombreCliente/{nombreCliente}")
	public List<TarjetaMongo> obtenerTarjetasCliente(@PathVariable(name="nombreCliente") String nombreCliente){
		return tarjetaRepository.findByNombreTitular(nombreCliente);
		
	}

	@GetMapping
	public  List<TarjetaMongo> obtenerTarjetas(){
		return tarjetaRepository.findAll();
	}


	@DeleteMapping("/{numeroTarjeta}")
	public void eliminarTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
	}

	@PutMapping("/{index}")
	public TarjetaMongo actualizarTarjeta(@PathVariable(name="index") int index, @RequestBody TarjetaMongo tarjeta) {

		return null;
	}
	
	@DeleteMapping("/todos")
	public void eliminarTodos() {
		
	}


}
