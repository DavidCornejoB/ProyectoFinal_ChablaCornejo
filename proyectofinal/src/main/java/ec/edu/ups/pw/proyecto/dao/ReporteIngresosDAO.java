package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	public List<ReporteIngresos> getReporteIngresos(){
		
		String jpqlReporteIngresos = "SELECT ri FROM ReporteIngresos ri";
		
		Query query = em.createQuery(jpqlReporteIngresos, ReporteIngresos.class);
		
		List<ReporteIngresos> reportesIngresos = query.getResultList();
		return reportesIngresos;
	}

}
