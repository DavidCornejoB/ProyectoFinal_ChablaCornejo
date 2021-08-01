package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.Categoria;

@Stateless
public class CategoriaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Categoria categoria) {
		em.persist(categoria);
	}
	
	public void update (Categoria categoria) {
		em.merge(categoria);
	}
	
	public Categoria read (int codigo) {
		Categoria ca = em.find(Categoria.class, codigo);
		return ca;
	}
	
	public void delete (int codigo) {
		Categoria ca = em.find(Categoria.class, codigo);
		em.remove(ca);
	}

}
