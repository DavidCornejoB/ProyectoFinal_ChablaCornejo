package ec.edu.ups.pw.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Detalle_Factura {
	
	@Id
	@Column(name = "detallefactura_id")
	private int codigo;
	
	private double cantidad;
	
	private double precio;
	
	@ManyToOne
	@JoinColumn(name = "facturacabecera_id", referencedColumnName = "facturacabecera_id")
	private Factura_Cabecera facturacabecera;
	
	@ManyToOne
	@JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
	private Producto producto;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Factura_Cabecera getFacturacabecera() {
		return facturacabecera;
	}

	public void setFacturacabecera(Factura_Cabecera facturacabecera) {
		this.facturacabecera = facturacabecera;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
}
