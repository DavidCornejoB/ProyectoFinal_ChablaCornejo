package ec.edu.ups.pw.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Detalle_Factura {
	
	@Id
	private int codigo;
	
	@ManyToOne
	private Factura_Cabecera facturaCabecera;
	
	@ManyToOne
	private ReporteEgresos reporteEgresos;

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
	 * @return the facturaCabecera
	 */
	public Factura_Cabecera getFacturaCabecera() {
		return facturaCabecera;
	}

	/**
	 * @param facturaCabecera the facturaCabecera to set
	 */
	public void setFacturaCabecera(Factura_Cabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}

	/**
	 * @return the reporteEgresos
	 */
	public ReporteEgresos getReporteEgresos() {
		return reporteEgresos;
	}

	/**
	 * @param reporteEgresos the reporteEgresos to set
	 */
	public void setReporteEgresos(ReporteEgresos reporteEgresos) {
		this.reporteEgresos = reporteEgresos;
	}
	

}
