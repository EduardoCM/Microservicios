package com.tarjetas.digitales.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class TarjetasDigitalesClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetasDigitalesClientesApplication.class, args);
	}

}
