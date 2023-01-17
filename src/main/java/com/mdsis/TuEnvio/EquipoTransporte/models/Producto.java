package com.mdsis.TuEnvio.EquipoTransporte.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {
	
	@Id
	private String tipoProducto;
	
	@Column
	private Integer cantidad;

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
