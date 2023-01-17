package com.mdsis.TuEnvio.EquipoAdministrativo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Camion {
	
	
	@Id
	private String placa;
	
	@Column 
	private String tipoProducto;
	  
	@Column
	private Integer capacidad;
	
	
	

	public Camion() {
		super();
	}

	public Camion(String placa, String tipoProducto, Integer capacidad) {
		super();
		this.placa = placa;
		this.tipoProducto = tipoProducto;
		this.capacidad = capacidad;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	  public Integer getCapacidad() { 
		  return capacidad; 
	}
	  
	  public void setCapacidad(Integer capacidad) { 
		  this.capacidad = capacidad; 
	}

	@Override
	public String toString() {
		return "Camion [placa=" + placa + ", tipoProducto=" + tipoProducto + ", capacidad=" + capacidad + "]";
	}
	  
	 
	 
	 
}
