package ec.edu.ups.pw.proyecto.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.pw.proyecto.business.CategoriaON;
import ec.edu.ups.pw.proyecto.business.ProductoON;
import ec.edu.ups.pw.proyecto.modelo.Categoria;
import ec.edu.ups.pw.proyecto.modelo.Producto;

@Path("administrador")
public class ProductosService {

	@Inject
	private CategoriaON categoriaON;

	@Inject
	private ProductoON productoON;

	@PUT
	@Path("/registrarCategoria")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Mensaje registrarCategoria(Categoria newCategoria) {
		Mensaje msj = new Mensaje();

		try {

			categoriaON.insertCategoria(newCategoria);
			System.out.println(newCategoria.getNombre());
			msj.setCodigo(1);
			msj.setMensaje("Ok se registro");
			return msj;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msj.setCodigo(2);
			msj.setMensaje("Error");
			return msj;
		}

	}

	@PUT
	@Path("/registrarProducto")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Mensaje registrarProducto(ProductoTemp producto) {
		Producto resultado = new Producto();
		Categoria categoria = categoriaON.getCategoriaNombre(producto);
		resultado = productoON.agregarCategoria(producto, categoria);
		Mensaje msj= new Mensaje();
	

		try {

			productoON.insertProducto(resultado);
			System.out.println(resultado.getNombre());
			msj.setCodigo(1);
			msj.setMensaje("Ok se registro");
			return msj;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msj.setCodigo(2);
			msj.setMensaje("Error: "+resultado.getCodigo() +" "+resultado.getNombre()+" "+resultado.getCategoria().getNombre()+" "+resultado.getCategoria().getCodigo());
			return msj;
		}

	}

}
