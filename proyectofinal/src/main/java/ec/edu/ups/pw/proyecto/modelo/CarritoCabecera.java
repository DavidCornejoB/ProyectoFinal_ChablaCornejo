package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CarritoCabecera {
	
	@Id
	private String codigo;
	private String fecha;
	
	@OneToMany
	private List<CarritoDetalle> listaCarritoDetalle;
	
	@ManyToOne
	private Persona persona;
	
	
	
	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	/**
	 * @return the listaCarritoDetalle
	 */
	public List<CarritoDetalle> getListaCarritoDetalle() {
		return listaCarritoDetalle;
	}
	/**
	 * @param listaCarritoDetalle the listaCarritoDetalle to set
	 */
	public void setListaCarritoDetalle(List<CarritoDetalle> listaCarritoDetalle) {
		this.listaCarritoDetalle = listaCarritoDetalle;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
