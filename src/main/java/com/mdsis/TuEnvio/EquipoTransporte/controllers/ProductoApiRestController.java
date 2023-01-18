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
		Integer suma_capacidad_total_max = 0;
		Integer restante = 0;
		for(Camion i:camionrepository.findAll()){
			if(i.getTipoProducto().equals(producto.getTipoProducto())) {
				suma_capacidad_total_max += i.getCapacidad();
			}	
		}
				for(Camion i:camionrepository.findAll()) {
					if(i.getTipoProducto().equals(producto.getTipoProducto())) {	
					    if(producto.getCantidad()<=suma_capacidad_total_max) {
					    	if(producto.getCantidad()>=i.getCapacidad()) {
					    		restante = producto.getCantidad()-i.getCapacidad();
					    		producto.setCantidad(restante);
					    		i.setCapacidad(0);
					    		camionrepository.save(i);
					    	}
					    	else {
					    		restante =i.getCapacidad()-producto.getCantidad();
					    		producto.setCantidad(0);
					    		i.setCapacidad(restante);
					    		camionrepository.save(i);
					    	} 	 
					    }
					    else {
					    	System.out.println("HTTP Status 400");
					    }
					    	
					    }
					}		
				}		
	}
	

