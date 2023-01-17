package com.mdsis.TuEnvio.EquipoTransporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdsis.TuEnvio.EquipoTransporte.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,String> {

}
