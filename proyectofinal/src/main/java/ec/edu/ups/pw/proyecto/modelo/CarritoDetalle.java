package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CarritoDetalle {
	
	@Id
	@Column(name = "carritodetalle_id")
	private int codigo;
	
	private Double cantidad;
	private Double precio;
	private Double iva;
	private Double total;
	
	@ManyToOne
	@JoinColumn(name = "carritocabecera_id")
	private CarritoCabecera carritoCabecera;
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto listProducto;

	public CarritoCabecera getCarritoCabecera() {
		return carritoCabecera;
	}

	public void setCarritoCabecera(CarritoCabecera carritoCabecera) {
		this.carritoCabecera = carritoCabecera;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
