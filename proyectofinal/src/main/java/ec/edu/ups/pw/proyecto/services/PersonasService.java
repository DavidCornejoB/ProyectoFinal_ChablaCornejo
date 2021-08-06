package ec.edu.ups.pw.proyecto.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.pw.proyecto.business.PersonaON;
import ec.edu.ups.pw.proyecto.business.RolON;
import ec.edu.ups.pw.proyecto.modelo.Persona;
import ec.edu.ups.pw.proyecto.modelo.Rol;

@Path("personas")
public class PersonasService {
	
	@Inject
	private PersonaON personaON;
	
	@Inject
	private RolON rolON;
	
	@PUT
	@Path("/registrarPersona")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Mensaje registrarUsuario(Persona newPersona) {

		Rol newRol= new Rol();
		Mensaje msj= new Mensaje();
		
		newRol.setRol("Cliente");
		newRol=rolON.getRolNombreList(newRol.getRol());
		newPersona.setRol(newRol);
		
		try {

			personaON.insertPersona(newPersona);
			System.out.println(newPersona.getRol().getRol());
			
			msj.setCodigo(1);
			msj.setMensaje("Ok se registro");
			
			return msj;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			msj.setCodigo(2);
			msj.setMensaje("Error" +newPersona.getRol().getCodigo());
			
			return msj;
		}
	
	}
	
	//***********************************************************************
	//***********************************************************************
	
	@PUT
	@Path("/iniciarSesion")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Mensaje iniciarSesion(Persona newPersona) {
		
		Mensaje msj= new Mensaje();
		newPersona=personaON.iniciarSesion(newPersona);
		
		System.out.println("Recupero: " + newPersona.getCedula());
		System.out.println(newPersona);
		
		if(newPersona.getCedula() != null) {
			if(newPersona.getRol().getRol().equals("Cliente")) {
				
				msj.setCodigo(1);
				msj.setMensaje("Si existe, iniciado, Cliente");
				
				return msj;
				
			} else if(newPersona.getRol().getRol().equals("Administrador")) {
				
				msj.setCodigo(2);
				msj.setMensaje("Si existe, iniciado, Administrador");
				
				return msj;
			}
			
		} else {
			
			msj.setCodigo(0);
			msj.setMensaje("Error no existe cuenta");
			
			return msj;
		}
		
		return msj;
	}
}
