package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.Rol;

@Stateless
public class RolDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Rol rol) {
		em.persist(rol);
	}
	
	public void update (Rol rol) {
		em.merge(rol);
	}
	
	public Rol read (int codigo) {
		Rol r = em.find(Rol.class, codigo);
		return r;
	}
	
	public void delete (int codigo) {
		Rol r = em.find(Rol.class, codigo);
		em.remove(r);
	}

}
