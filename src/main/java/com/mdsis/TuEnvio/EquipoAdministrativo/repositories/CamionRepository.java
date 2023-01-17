package com.mdsis.TuEnvio.EquipoAdministrativo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdsis.TuEnvio.EquipoAdministrativo.models.Camion;

@Repository
public interface CamionRepository extends JpaRepository<Camion,Integer>{
	
}

