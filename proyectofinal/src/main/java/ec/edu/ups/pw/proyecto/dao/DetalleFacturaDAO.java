package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.Detalle_Factura;

@Stateless
public class DetalleFacturaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Detalle_Factura detallefactura) {
		em.persist(detallefactura);
	}
	
	public void update (Detalle_Factura detallefactura) {
		em.merge(detallefactura);
	}
	
	public Detalle_Factura read (int codigo) {
		Detalle_Factura df = em.find(Detalle_Factura.class, codigo);
		return df;
	}
	
	public void delete (int codigo) {
		Detalle_Factura df = em.find(Detalle_Factura.class, codigo);
		em.remove(df);
	}
	

}
