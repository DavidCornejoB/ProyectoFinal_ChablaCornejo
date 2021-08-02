package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
