package com.tarjetas.digitales.clientes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tarjetas.digitales.clientes.model.TarjetaMongo;
import java.lang.String;
import java.util.List;

public interface TarjetaRepositoryMongo extends MongoRepository<TarjetaMongo, Integer> {
	
	
	TarjetaMongo findByNumeroTarjeta(String numerotarjeta);
	
	
	List<TarjetaMongo> findByNombreTitular(String nombretitular);

}
