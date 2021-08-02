package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public List<Carrito> getCarritos(){
		
		String jpqlCarrito = "SELECT c FROM Carrito c";
		
		Query query = em.createQuery(jpqlCarrito, Carrito.class);
		
		List<Carrito> carritos = query.getResultList();
		return carritos;
	}
}
