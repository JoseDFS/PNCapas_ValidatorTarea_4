package com.uca.capas.tareaValidator.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="Ingresa codigo de producto.")
	@Size(min=12,max=12, message ="El codigo tiene que tener 12 digitos.")
	String idProducto;
	
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="Ingrese un numero")
	String existencia;
	
	@Size(min=1,max=100)
	String nombreProducto;
	
	@Size(min=1,max=100)
	String marca;
	
	@Size(min=1,max=500)
	String descripcion;
	
	@Pattern(regexp = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$",message="El formato de la fecha tiene que ser: DD/MM/YYYY")
	String fecha;

	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getExistencia() {
		return existencia;
	}
	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}
