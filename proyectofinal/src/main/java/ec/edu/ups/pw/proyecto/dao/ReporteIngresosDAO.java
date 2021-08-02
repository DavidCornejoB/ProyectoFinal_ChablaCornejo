package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.ReporteIngresos;

@Stateless
public class ReporteIngresosDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (ReporteIngresos reporteingresos) {
		em.persist(reporteingresos);
	}
	
	public void update (ReporteIngresos reporteingresos) {
		em.merge(reporteingresos);
	}
	
	public ReporteIngresos read (int codigo) {
		ReporteIngresos ri = em.find(ReporteIngresos.class, codigo);
		return ri;
	}
	
	public void delete (int codigo) {
		ReporteIngresos ri = em.find(ReporteIngresos.class, codigo);
		em.remove(ri);
	}

}
