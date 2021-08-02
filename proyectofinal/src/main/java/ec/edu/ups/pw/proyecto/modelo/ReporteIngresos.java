package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ReporteIngresos {

	@Id
	private int codigo;
	
	@OneToMany
	private List<Producto> listProducto;
	
	@OneToMany
	private List<Persona> listPersona;

	
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
	 * @return the listPersona
	 */
	public List<Persona> getListPersona() {
		return listPersona;
	}

	/**
	 * @param listPersona the listPersona to set
	 */
	public void setListPersona(List<Persona> listPersona) {
		this.listPersona = listPersona;
	}
	
	
	
		
}
