package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol {
	
	@Id
	private int codigo;
	
	private String rol;
	
	@OneToMany
	private List<Persona> listaPersona;
	
	
	/**
	 * @return the listaPersona
	 */
	public List<Persona> getListaPersona() {
		return listaPersona;
	}
	/**
	 * @param listaPersona the listaPersona to set
	 */
	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
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
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
