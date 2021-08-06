package ec.edu.ups.pw.proyecto.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.proyecto.dao.CategoriaDAO;
import ec.edu.ups.pw.proyecto.modelo.Categoria;
import ec.edu.ups.pw.proyecto.services.ProductoTemp;

@Stateless
public class CategoriaON {
	
	@Inject
	private CategoriaDAO daoCategoria;
	
	public void insertCategoria(Categoria Categoria) throws Exception {
		
		daoCategoria.insert(Categoria);	
	}

	public void updateCategoria(Categoria Categoria) throws Exception {
		
		daoCategoria.update(Categoria);
	}
	
	public void deleteProducto(int codigo) throws Exception {
		
		daoCategoria.delete(codigo);
	}
	
	public List<Categoria> getCategorias() {
	
		
		return daoCategoria.getCategorias();
	}
	
	public Categoria getCategoriaNombre(ProductoTemp producto) {
		String nombre = producto.getCategoria();
		List<Categoria> categoria = daoCategoria.getCategoriaNombre(nombre);
		Categoria res = new Categoria();
		for(Categoria elemento:categoria) {
			res.setCodigo(elemento.getCodigo());
			res.setNombre(elemento.getNombre());
		
		}
		
		return res;
		
	}

}
