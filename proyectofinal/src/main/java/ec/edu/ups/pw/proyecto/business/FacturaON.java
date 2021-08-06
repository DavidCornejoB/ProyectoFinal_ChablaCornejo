package ec.edu.ups.pw.proyecto.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.proyecto.dao.DetalleFacturaDAO;
import ec.edu.ups.pw.proyecto.dao.FacturaCabeceraDAO;
import ec.edu.ups.pw.proyecto.modelo.Factura_Cabecera;

@Stateless
public class FacturaON {
	
	@Inject
	private FacturaCabeceraDAO daoFacturaCab;
	
	@Inject
	private DetalleFacturaDAO daoFacturaDet;
	
	public void insertCarrito(Factura_Cabecera facturaCab) throws Exception{
		
		daoFacturaCab.insert(facturaCab);
		
	}
	
	public void updateCarrito(Factura_Cabecera facturaCab) throws Exception {
		
		daoFacturaCab.update(facturaCab);
		
	}
	
	public void deleteFactura(Factura_Cabecera facturaCab) throws Exception{
		
		String com= String.valueOf(facturaCab.getNumero());
		daoFacturaCab.delete(com);
	
	}
	
	public List<Factura_Cabecera> getFactura_Cabeceras() {
		
		//if(!this.validaCedula(persona.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Persona per= daoPersona.read("0102930888");
	
		//return daoFacturaCab.getFacturasCabeceras("%");

		return daoFacturaCab.getFacturasCabeceras();
	}
	
	public Factura_Cabecera getFacturaCabecera(String  numero) {
		Factura_Cabecera p= daoFacturaCab.read(numero);
		return p;
	}

}
