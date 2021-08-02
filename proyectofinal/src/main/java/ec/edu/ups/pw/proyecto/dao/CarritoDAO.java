package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.Carrito;

@Stateless
public class CarritoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Carrito carrito) {
		em.persist(carrito);
	}
	
	public void update (Carrito carrito) {
		em.merge(carrito);
	}
	
	public Carrito read (int codigo) {
		Carrito c = em.find(Carrito.class, codigo);
		return c;
	}
	
	public void delete (int codigo) {
		Carrito c = em.find(Carrito.class, codigo);
		em.remove(c);
	}

}
