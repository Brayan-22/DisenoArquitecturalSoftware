package com.disenoarquitecturalpatrones.restaurante.models;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido_producto")
public class PedidoProducto {

	@EmbeddedId
	private PedidoProductoId id;
	
	
	@ManyToOne
	@MapsId("pedidoId")
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@MapsId("productoId")
	@JoinColumn(name = "producto_id")
	private Producto producto;
	
	private int cantidad;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
