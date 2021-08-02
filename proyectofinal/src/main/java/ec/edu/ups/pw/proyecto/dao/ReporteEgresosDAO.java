package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.ReporteEgresos;

@Stateless
public class ReporteEgresosDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (ReporteEgresos reporteegresos) {
		em.persist(reporteegresos);
	}
	
	public void update (ReporteEgresos reporteegresos) {
		em.merge(reporteegresos);
	}
	
	public ReporteEgresos read (int codigo) {
		ReporteEgresos re = em.find(ReporteEgresos.class, codigo);
		return re;
	}
	
	public void delete (int codigo) {
		ReporteEgresos re = em.find(ReporteEgresos.class, codigo);
		em.remove(re);
	}

}
