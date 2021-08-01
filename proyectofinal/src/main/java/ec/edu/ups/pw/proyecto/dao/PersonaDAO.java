package ec.edu.ups.pw.proyecto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw.proyecto.modelo.Persona;

@Stateless
public class PersonaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Persona persona) {
		em.persist(persona);
	}
	
	public void update(Persona persona) {
		em.merge(persona);
	}
	
	public Persona read (String cedula) {
		Persona p = em.find(Persona.class, cedula);
		return p;
	}
	
	public void delete (String cedula) {
		Persona p = em.find(Persona.class, cedula);
		em.remove(p);
	}
	

}
