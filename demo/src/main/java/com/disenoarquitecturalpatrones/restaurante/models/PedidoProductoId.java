package com.disenoarquitecturalpatrones.restaurante.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class PedidoProductoId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long pedidoId;
	private Long productoId;
	public Long getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}
	public Long getProductoId() {
		return productoId;
	}
	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}
	public PedidoProductoId(Long pedidoId, Long productoId) {
		super();
		this.pedidoId = pedidoId;
		this.productoId = productoId;
	}
	
}
