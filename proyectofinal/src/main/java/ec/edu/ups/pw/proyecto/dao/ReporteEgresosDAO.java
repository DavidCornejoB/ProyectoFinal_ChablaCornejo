package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	public List<ReporteEgresos> getReporteEgresos(){
		
		String jpqlReporteEgresos = "SELECT re FROM ReporteEgresos re";
		
		Query query = em.createQuery(jpqlReporteEgresos, ReporteEgresos.class);
		
		List<ReporteEgresos> reportesEgresos = query.getResultList();
		return reportesEgresos;
	}

}
