package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.proyecto.modelo.Categoria;
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
	
	public List<Producto> getProductos(){
		
		String jpqlProducto = "SELECT p FROM Producto p";
		
		Query query = em.createQuery(jpqlProducto, Producto.class);
		
		List<Producto> productos = query.getResultList();
		return productos;
	}
	
	public List<Producto> getProductosNombre(String nombre){
		
		String jpqlProductoNombre = "SELECT p FROM Producto p WHERE nombre LIKE ?1";
		
		nombre = nombre + "%";
		
		Query query = em.createQuery(jpqlProductoNombre, Producto.class);
		query.setParameter(1, nombre);
		
		List<Producto> productos = query.getResultList();
		return productos;
		
	}
	
	public List<Producto> getProductosCategoria(Categoria categoria){
		
		String jpqlProductoCategoria = "SELECT p FROM Procuto p WHERE categoria_id = ?1";
		
		Query query = em.createQuery(jpqlProductoCategoria, Producto.class);
		query.setParameter(1, categoria);
		
		List<Producto> productos = query.getResultList();
		return productos;
	}

}
