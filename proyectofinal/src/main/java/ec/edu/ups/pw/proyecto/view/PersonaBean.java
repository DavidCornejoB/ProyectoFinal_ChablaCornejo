package ec.edu.ups.pw.proyecto.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.pw.proyecto.business.PersonaON;
import ec.edu.ups.pw.proyecto.modelo.Persona;
import ec.edu.ups.pw.proyecto.modelo.Rol;

@Named
@RequestScoped
public class PersonaBean {
	private String nombre;
	private String cedula;
	private String apellido;
	private String clave;
	private String correo;
	private String direccion;
	private Rol rol;
	private Persona newPersona = new Persona();
	private List<Persona> personas;

	@Inject
	private PersonaON personaON;

	@PostConstruct
	public void init() {
		personas = personaON.getPersonas();
		System.out.println(personas);
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona getNewPersona() {
		return newPersona;
	}

	public void setNewPersona(Persona newPersona) {
		this.newPersona = newPersona;
	}

	public String guardarPersona() {

		try {
			personaON.insertPersona(newPersona);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "listar-personas?faces-redirect=true";

	}
}
