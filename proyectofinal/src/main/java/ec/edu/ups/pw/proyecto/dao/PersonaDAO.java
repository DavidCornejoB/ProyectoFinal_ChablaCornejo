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
	
	public List<Persona> getPersonas(String nombre){
		
		String jpqlPersona = "SELECT p FROM Persona p" + " WHERE correo LIKE ?1";
		nombre = nombre + "%";
		
		Query query = em.createQuery(jpqlPersona, Persona.class);
		query.setParameter(1, nombre);
		
		List<Persona> personas = query.getResultList();
		return personas;
	}
	
	public List<Persona> getIniciarSesion(Persona persona){
		
		String correo = persona.getCorreo();
		String contrasena = persona.getClave();
		String jpqlSesion = "SELECT p FROM Persona p" + " WHERE correo LIKE ?1 AND clave LIKE ?2";
		
		Query query = em.createQuery(jpqlSesion, Persona.class);
		query.setParameter(1, correo);
		query.setParameter(2, contrasena);
		
		List<Persona> personas = query.getResultList();
		
		return personas;
		
	}
	

}
