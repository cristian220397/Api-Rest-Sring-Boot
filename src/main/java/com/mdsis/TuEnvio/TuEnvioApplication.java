package com.mdsis.TuEnvio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mdsis.TuEnvio.EquipoAdministrativo.models.Camion;
import com.mdsis.TuEnvio.EquipoAdministrativo.repositories.CamionRepository;

@SpringBootApplication
public class TuEnvioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuEnvioApplication.class, args);
	}
}
