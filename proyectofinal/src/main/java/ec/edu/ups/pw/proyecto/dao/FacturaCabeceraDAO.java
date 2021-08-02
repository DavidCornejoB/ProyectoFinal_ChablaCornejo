package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.proyecto.modelo.Factura_Cabecera;

@Stateless
public class FacturaCabeceraDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Factura_Cabecera factura_cabecera) {
		em.persist(factura_cabecera);
	}
	
	public void update (Factura_Cabecera factura_cabecera) {
		em.merge(factura_cabecera);
	}
	
	public Factura_Cabecera read (String numero) {
		Factura_Cabecera f = em.find(Factura_Cabecera.class, numero);
		return f;
	}
	
	public void delete (String numero) {
		Factura_Cabecera f = em.find(Factura_Cabecera.class, numero);	
		em.remove(f);
	}
	
	public List<Factura_Cabecera> getFacturasCabeceras(){
		
		String jpqlFacturaCabecera = "SELECT f FROM Factura_Cabecera f";
		
		Query query = em.createQuery(jpqlFacturaCabecera, Factura_Cabecera.class);
		
		List<Factura_Cabecera> facturasCabeceras = query.getResultList();
		return facturasCabeceras;
	}

}
