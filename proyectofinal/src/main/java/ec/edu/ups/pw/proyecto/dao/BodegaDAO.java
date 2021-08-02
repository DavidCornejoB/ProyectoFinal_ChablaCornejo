package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.proyecto.modelo.Bodega;

@Stateless
public class BodegaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Bodega bodega) {
		em.persist(bodega);
	}
	
	public void update(Bodega bodega) {
		em.merge(bodega);
	}
	
	public Bodega read(int codigo) {
		Bodega b = em.find(Bodega.class, codigo);
		return b;
	}
	
	public void delete (int codigo) {
		Bodega b = em.find(Bodega.class, codigo);
		em.remove(b);
	}
	
	public List<Bodega> getBodegas(){
		String jpqlBodega = "SELECT b FROM Bodega b";
		
		Query query = em.createQuery(jpqlBodega, Bodega.class);
		
		List<Bodega> bodegas = query.getResultList();
		return bodegas;
	}

}
