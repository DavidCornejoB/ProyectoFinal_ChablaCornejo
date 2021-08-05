package ec.edu.ups.pw.proyecto.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.proyecto.dao.PersonaDAO;
import ec.edu.ups.pw.proyecto.modelo.Persona;

@Stateless
public class PersonaON {

	@Inject
	private PersonaDAO daoPersona;
	
public void insertPersona(Persona persona) throws Exception {
		daoPersona.insert(persona);
	}

	public void updatePersona(Persona persona) throws Exception {
		daoPersona.update(persona);
	}
	
	public void deleteProducto(Persona persona) throws Exception {
		String com = String.valueOf(persona.getCedula());
		daoPersona.delete(com);
	}
	
	public List<Persona> getPersonas() {
		
		return daoPersona.getPersonas("%");
	}
	
	public Persona getPersona(String cedula) {
		
		Persona p = daoPersona.read(cedula);
		return p;
	}
	
	public Persona iniciarSesion(Persona persona) {
		
		List<Persona> personas = daoPersona.getIniciarSesion(persona);
		
		Persona resultado = new Persona();
		
		for(Persona elemento: personas) {
			resultado.setCedula(elemento.getCedula());
			resultado.setNombre(elemento.getNombre());
			resultado.setDireccion(elemento.getDireccion());
			resultado.setApellido(elemento.getApellido());
			resultado.setRol(elemento.getRol());
			resultado.setCorreo(elemento.getCorreo());
			resultado.setClave(elemento.getClave());
			
			System.out.println("Elemento: " + elemento.getCorreo());
		}
		return resultado;
	}
	
}

