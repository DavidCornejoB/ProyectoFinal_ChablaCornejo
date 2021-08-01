package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.Producto;

@Stateless
public class ProductoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Producto producto) {
		em.persist(producto);
	}
	
	public void update (Producto producto) {
		em.merge(producto);
	}
	
	public Producto read (int codigo) {
		Producto p = em.find(Producto.class, codigo);
		return p;
	}
	
	public void delete (int codigo) {
		Producto p = em.find(Producto.class, codigo);
		em.remove(p);
	}

}
