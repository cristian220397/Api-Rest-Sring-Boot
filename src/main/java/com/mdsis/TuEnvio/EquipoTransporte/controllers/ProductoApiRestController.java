package com.mdsis.TuEnvio.EquipoTransporte.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdsis.TuEnvio.EquipoAdministrativo.models.Camion;
import com.mdsis.TuEnvio.EquipoAdministrativo.repositories.CamionRepository;
import com.mdsis.TuEnvio.EquipoTransporte.models.Producto;
import com.mdsis.TuEnvio.EquipoTransporte.repositories.ProductoRepository;


@RestController
@RequestMapping("productos")
public class ProductoApiRestController {
	@Autowired
	private ProductoRepository productorepository;
	
	@Autowired
	private CamionRepository camionrepository;
	
	@PostMapping("/cargar_camion")
	public void cargarcamion(@RequestBody Producto producto) {
		
			productorepository.save(producto);
	}
	
}
