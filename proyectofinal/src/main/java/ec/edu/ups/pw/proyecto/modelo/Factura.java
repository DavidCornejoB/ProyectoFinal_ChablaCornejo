package ec.edu.ups.pw.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Factura {

	@Id
	private String numero;
	
	private String fecha;

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
