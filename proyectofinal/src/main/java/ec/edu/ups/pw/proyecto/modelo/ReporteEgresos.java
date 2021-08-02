package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ReporteEgresos {

	@Id
	private int codigo;
	
	@OneToMany
	private List<Detalle_Factura> listDeatlleFactura;
	
	

	/**
	 * @return the listDeatlleFactura
	 */
	public List<Detalle_Factura> getListDeatlleFactura() {
		return listDeatlleFactura;
	}

	/**
	 * @param listDeatlleFactura the listDeatlleFactura to set
	 */
	public void setListDeatlleFactura(List<Detalle_Factura> listDeatlleFactura) {
		this.listDeatlleFactura = listDeatlleFactura;
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
