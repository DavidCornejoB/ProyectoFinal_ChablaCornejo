package ec.edu.ups.pw.proyecto.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ReporteEgresos {

	@Id
	@Column(name = "reporteegresos_id")
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name = "detallefactura_id")
	private Detalle_Factura detallefactura;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Detalle_Factura getDetallefactura() {
		return detallefactura;
	}

	public void setDetallefactura(Detalle_Factura detallefactura) {
		this.detallefactura = detallefactura;
	}

}
