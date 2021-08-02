package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Producto {
	
	@Id
	private int codigo;
	
	@Column(length = 20, name = "pro_nombre")
	private String nombre;
	
	@ManyToOne
	private CarritoDetalle carritoDetalle;
	
	private Double valorUnitario;
	private int stock;
	
	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Bodega bodega;
	
	@OneToMany
	private List<Detalle_Factura> listDetalleFactura;
	
	@ManyToOne
	private ReporteIngresos reporteIngresos;
	
	
	/**
	 * @return the listDetalleFactura
	 */
	public List<Detalle_Factura> getListDetalleFactura() {
		return listDetalleFactura;
	}
	/**
	 * @param listDetalleFactura the listDetalleFactura to set
	 */
	public void setListDetalleFactura(List<Detalle_Factura> listDetalleFactura) {
		this.listDetalleFactura = listDetalleFactura;
	}
	/**
	 * @return the reporteIngresos
	 */
	public ReporteIngresos getReporteIngresos() {
		return reporteIngresos;
	}
	/**
	 * @param reporteIngresos the reporteIngresos to set
	 */
	public void setReporteIngresos(ReporteIngresos reporteIngresos) {
		this.reporteIngresos = reporteIngresos;
	}
	/**
	 * @return the bodega
	 */
	public Bodega getBodega() {
		return bodega;
	}
	/**
	 * @param bodega the bodega to set
	 */
	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}
	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the carritoDetalle
	 */
	public CarritoDetalle getCarritoDetalle() {
		return carritoDetalle;
	}
	/**
	 * @param carritoDetalle the carritoDetalle to set
	 */
	public void setCarritoDetalle(CarritoDetalle carritoDetalle) {
		this.carritoDetalle = carritoDetalle;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the valorUnitario
	 */
	public Double getValorUnitario() {
		return valorUnitario;
	}
	/**
	 * @param valorUnitario the valorUnitario to set
	 */
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
