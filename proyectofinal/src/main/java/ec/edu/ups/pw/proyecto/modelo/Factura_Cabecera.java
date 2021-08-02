package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Factura_Cabecera {

	@Id
	private String numero;
	
	private String fecha;
	
	@OneToMany
	private List<Persona> listpersona;
	
	@OneToMany
	private List<Detalle_Factura> listDetalleFctura;
	
	

	/**
	 * @return the listpersona
	 */
	public List<Persona> getListpersona() {
		return listpersona;
	}

	/**
	 * @param listpersona the listpersona to set
	 */
	public void setListpersona(List<Persona> listpersona) {
		this.listpersona = listpersona;
	}

	/**
	 * @return the listDetalleFctura
	 */
	public List<Detalle_Factura> getListDetalleFctura() {
		return listDetalleFctura;
	}

	/**
	 * @param listDetalleFctura the listDetalleFctura to set
	 */
	public void setListDetalleFctura(List<Detalle_Factura> listDetalleFctura) {
		this.listDetalleFctura = listDetalleFctura;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
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
