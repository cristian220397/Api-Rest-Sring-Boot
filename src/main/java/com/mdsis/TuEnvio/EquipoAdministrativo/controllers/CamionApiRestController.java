package com.mdsis.TuEnvio.EquipoAdministrativo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdsis.TuEnvio.EquipoAdministrativo.models.Camion;
import com.mdsis.TuEnvio.EquipoAdministrativo.repositories.CamionRepository;

@RestController
@RequestMapping("camiones")
public class CamionApiRestController {
	
	@Autowired
	private CamionRepository camionrepository;
	
	@PostMapping("/registrar_camiones")
	public void registrarcamion(@RequestBody Camion camion) {
		camionrepository.save(camion);
	}
		
	@GetMapping("/listar_camiones")
	public List<Camion> listarcamiones(){
		return camionrepository.findAll();	
	}
	
	@DeleteMapping("/eliminar_camion/{id}")
	public void eliminarcamion(@PathVariable("id") Integer id) {
		camionrepository.deleteById(id);
	}
	
	@PutMapping("/modificar_camion")
	public void modificarcamion(@RequestBody Camion camion) {
		camionrepository.save(camion);
		
	}

}
