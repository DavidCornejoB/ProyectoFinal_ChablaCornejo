package ec.edu.ups.pw.proyecto.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.proyecto.dao.CategoriaDAO;
import ec.edu.ups.pw.proyecto.dao.ProductoDAO;
import ec.edu.ups.pw.proyecto.modelo.Categoria;
import ec.edu.ups.pw.proyecto.modelo.Producto;
import ec.edu.ups.pw.proyecto.services.ProductoTemp;

@Stateless
public class ProductoON {

	@Inject
	private ProductoDAO daoProducto;
	
	@Inject
	private CategoriaDAO daoCategoria;
	
public void insertProducto(Producto producto) throws Exception {
		
		daoProducto.insert(producto);	
	}

	public void updateProducto(Producto producto) throws Exception {
		
		daoProducto.update(producto);
	}
	
	public void deleteProducto(Producto producto) throws Exception {
		int com = producto.getCodigo();
		daoProducto.delete(com);
	}
	
	public List<Producto> getProductos() {
		
		return daoProducto.getProductos();
	}
	
	public Producto getProducto(int codigo) {
		Producto p= daoProducto.read(codigo);
		return p;
	}
	
	public Producto agregarCategoria(ProductoTemp producto , Categoria categoria) {
		Producto resultado= new Producto();
		resultado.setCodigo(producto.getCodigo());
		resultado.setNombre(producto.getNombre());
		resultado.setValorUnitario(producto.getValorUnitario());
		resultado.setCategoria(categoria);
		return resultado;
	}
	
	public Producto recuperarProductoNombre(ProductoTemp producto) {
		Producto resultado= new Producto();
		String nombre=producto.getNombre();
		System.out.println("Nombre:" +nombre);
		List<Producto> listaproducto= daoProducto.getProductosNombre(nombre);
		for(Producto elemento: listaproducto) {
			resultado.setCodigo(elemento.getCodigo());
			resultado.setNombre(elemento.getNombre());
			resultado.setValorUnitario(elemento.getValorUnitario());
			resultado.setCategoria(elemento.getCategoria());
		}
	System.out.println(resultado.getNombre() +"Recuperado");
		return resultado;
	}
	
	/*
	public List<Producto> buscarProductos(String nombre) {
		return daoProducto.getProductosBuscar(nombre);
		
	}
	*/
	
	public List<Producto> recuperarProductoCategoria(String nombre){
		Categoria newCategoria= new Categoria();
		List<Categoria> categorias=daoCategoria.getCategoriaNombre(nombre);
		
		for(Categoria elemento: categorias) {
			newCategoria.setCodigo(elemento.getCodigo());
			newCategoria.setNombre(elemento.getNombre());
		}
		
		System.out.println("Es: "+ newCategoria.getCodigo()+ " "+newCategoria.getNombre());
		List<Producto> productos=daoProducto.getProductosCategoria(newCategoria);
		System.out.println(productos.get(0).getNombre());
		
		return productos;
	}
}
