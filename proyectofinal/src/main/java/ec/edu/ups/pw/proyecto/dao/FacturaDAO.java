package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.proyecto.modelo.Factura;

@Stateless
public class FacturaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Factura factura) {
		em.persist(factura);
	}
	
	public void update (Factura factura) {
		em.merge(factura);
	}
	
	public Factura read (String numero) {
		Factura f = em.find(Factura.class, numero);
		return f;
	}
	
	public void delete (String numero) {
		Factura f = em.find(Factura.class, numero);	
		em.remove(f);
	}
	
	public List<Factura> getFacturas(){
		
		String jpqlFactura = "SELECT f FROM Factura f";
		
		Query query = em.createQuery(jpqlFactura, Factura.class);
		
		List<Factura> facturas = query.getResultList();
		return facturas;
	}

}
