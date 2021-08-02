package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bodega {
	
	@Id
	private int codigo;
	
	@Column
	private Producto producto;
	
	@OneToMany
	private List<Producto> listProducto;
	
	

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
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
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
	
	

}
