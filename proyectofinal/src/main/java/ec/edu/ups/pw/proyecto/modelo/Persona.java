package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Persona {
	
	@Id
	@Column(length = 10, name = "per_cedula")
	private String Cedula;
	
	private String nombre;
	private String apellido;
	private String direccion;
	private String correo;	
	private String clave;
	
	@ManyToOne
	private Rol rol; 
	
	@OneToMany
    private List<CarritoCabecera> listCarritoCabecera;

	@OneToMany
	private List<ReporteIngresos> listReporteIngresos;
	
	@OneToMany
	private List<Factura_Cabecera> listFacturaCabecera;
	
	
	
	/**
	 * @return the listReporteIngresos
	 */
	public List<ReporteIngresos> getListReporteIngresos() {
		return listReporteIngresos;
	}
	/**
	 * @param listReporteIngresos the listReporteIngresos to set
	 */
	public void setListReporteIngresos(List<ReporteIngresos> listReporteIngresos) {
		this.listReporteIngresos = listReporteIngresos;
	}
	/**
	 * @return the listFacturaCabecera
	 */
	public List<Factura_Cabecera> getListFacturaCabecera() {
		return listFacturaCabecera;
	}
	/**
	 * @param listFacturaCabecera the listFacturaCabecera to set
	 */
	public void setListFacturaCabecera(List<Factura_Cabecera> listFacturaCabecera) {
		this.listFacturaCabecera = listFacturaCabecera;
	}
	/**
	 * @return the listCarritoCabecera
	 */
	public List<CarritoCabecera> getListCarritoCabecera() {
		return listCarritoCabecera;
	}
	/**
	 * @param listCarritoCabecera the listCarritoCabecera to set
	 */
	public void setListCarritoCabecera(List<CarritoCabecera> listCarritoCabecera) {
		this.listCarritoCabecera = listCarritoCabecera;
	}
	/**
	 * @return the reporteIngresos
	 */
	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return Cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		Cedula = cedula;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	

}
