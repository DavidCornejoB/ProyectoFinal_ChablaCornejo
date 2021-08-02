package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CarritoDetalle {
	
	@Id
	private int codigo;
	
	private Double cantidad;
	private Double precio;
	private Double iva;
	private Double total;
	
	@ManyToOne
	private CarritoCabecera carritoCabecera;
	
	@OneToMany
	private List<Producto> listProducto;
	
	
	/**
	 * @return the carritoCabecera
	 */
	public CarritoCabecera getCarritoCabecera() {
		return carritoCabecera;
	}
	/**
	 * @param carritoCabecera the carritoCabecera to set
	 */
	public void setCarritoCabecera(CarritoCabecera carritoCabecera) {
		this.carritoCabecera = carritoCabecera;
	}
	/**
	 * @return the producto
	 */
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @return the listProducto
	 */
	public List<Producto> getListProducto() {
		return listProducto;
	}
	/**
	 * @param listProducto the listProducto to set
	 */
	public void setListProducto(List<Producto> listProducto) {
		this.listProducto = listProducto;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the cantidad
	 */
	public Double getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * @return the iva
	 */
	public Double getIva() {
		return iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(Double iva) {
		this.iva = iva;
	}
	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	

}
