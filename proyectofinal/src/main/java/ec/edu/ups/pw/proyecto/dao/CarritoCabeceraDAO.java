package ec.edu.ups.pw.proyecto.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.proyecto.modelo.CarritoCabecera;

@Stateless
public class CarritoCabeceraDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert (CarritoCabecera carritocabecera) {
		em.persist(carritocabecera);
	}
	
	public void update (CarritoCabecera carritocabecera) {
		em.merge(carritocabecera);
	}
	
	public CarritoCabecera read (String codigo) {
		CarritoCabecera cc = em.find(CarritoCabecera.class, codigo);
		return cc;
	}
	
	public void delete (String codigo) {
		CarritoCabecera cc = em.find(CarritoCabecera.class, codigo);
		em.remove(cc);
	}
	
	public List<CarritoCabecera> getCarritoCabeceras(){
		
		String jpqlCarritoCabecera = "SELECT cc FROM CarritoCabecera";
		
		Query query = em.createQuery(jpqlCarritoCabecera, CarritoCabecera.class);
		
		List<CarritoCabecera> carritocabeceras = query.getResultList();
		return carritocabeceras;
	}
	

}
