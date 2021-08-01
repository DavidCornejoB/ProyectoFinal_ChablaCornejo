package ec.edu.ups.pw.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReporteEgresos {

	@Id
	private int codigo;

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
