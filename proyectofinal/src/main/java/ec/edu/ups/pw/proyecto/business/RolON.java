package ec.edu.ups.pw.proyecto.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.proyecto.dao.RolDAO;
import ec.edu.ups.pw.proyecto.modelo.Rol;

@Stateless
public class RolON {
	
	@Inject
	private RolDAO daoRol;
	
	
	public void insertRol(Rol rol) throws Exception {	
		 daoRol.insert(rol);	
	}

	public void updateRol(Rol rol) throws Exception {
		daoRol.update(rol);
	}
	
	public void deleteRol(int codigo) throws Exception {
		daoRol.delete(codigo);
	}
	
	public List<Rol> getRols() {
		return daoRol.getRoles();
	}
	
	public Rol getRolNombre(String nombre) {
		return daoRol.getRolNombre(nombre);
	}
	
	public Rol getRolNombreList(String nombre){
		
		List<Rol> roles= daoRol.getRolNombreList(nombre);
		Rol rol= new Rol();
		
		for(Rol elemento:roles) {
			rol.setCodigo(elemento.getCodigo());
			rol.setRol(elemento.getRol());
		}
		return rol;
	}
	
	public Rol readRol(int codigo){
		return daoRol.read(codigo);
		}

}
