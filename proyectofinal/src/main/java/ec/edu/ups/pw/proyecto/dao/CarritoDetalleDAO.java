package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.proyecto.modelo.CarritoDetalle;

@Stateless
public class CarritoDetalleDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (CarritoDetalle carritoDetalle) {
		em.persist(carritoDetalle);
	}
	
	public void update (CarritoDetalle carritoDetalle) {
		em.merge(carritoDetalle);
	}
	
	public CarritoDetalle read (int codigo) {
		CarritoDetalle c = em.find(CarritoDetalle.class, codigo);
		return c;
	}
	
	public void delete (int codigo) {
		CarritoDetalle c = em.find(CarritoDetalle.class, codigo);
		em.remove(c);
	}

	public List<CarritoDetalle> getCarritosDetalles(){
		
		String jpqlCarritoDetalle = "SELECT c FROM CarritoDetalle c";
		
		Query query = em.createQuery(jpqlCarritoDetalle, CarritoDetalle.class);
		
		List<CarritoDetalle> carritosDetalles = query.getResultList();
		return carritosDetalles;
	}
}
