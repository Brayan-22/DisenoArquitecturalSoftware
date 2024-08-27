package com.disenoarquitecturalpatrones.restaurante.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProducto;
	private String nombreProducto;
	private Double precioProducto;
	@OneToMany(mappedBy = "producto")
	private List<PedidoProducto> pedidoProducto ;
	
	public List<PedidoProducto> getPedidoProducto() {
		return pedidoProducto;
	}
	public void setPedidoProducto(List<PedidoProducto> pedidoProducto) {
		this.pedidoProducto = pedidoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Producto(String nombreProducto, Double precioProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}
	
	
}
