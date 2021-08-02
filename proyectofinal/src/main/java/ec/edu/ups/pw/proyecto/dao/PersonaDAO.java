package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	public List<Persona> getPersonas(){
		
		String jpqlPersona = "SELECT p FROM Persona p";
		
		Query query = em.createQuery(jpqlPersona, Persona.class);
		
		List<Persona> personas = query.getResultList();
		return personas;
	}
	

}
