package ec.edu.ups.pw.proyecto.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.proyecto.dao.CarritoCabeceraDAO;
import ec.edu.ups.pw.proyecto.dao.ProductoDAO;
import ec.edu.ups.pw.proyecto.modelo.CarritoCabecera;
import ec.edu.ups.pw.proyecto.modelo.CarritoDetalle;
import ec.edu.ups.pw.proyecto.modelo.Producto;
import ec.edu.ups.pw.proyecto.services.ProductoTemp;

@Stateless
public class CarritoON {
	
	@Inject
	private ProductoDAO daoProducto;
	
	@Inject
	private CarritoCabeceraDAO daoCarrito;
	
	public void insertCarrito(CarritoCabecera carrito) throws Exception{
		
		daoCarrito.insert(carrito);
		
	}
	
	public void updateCarrito(CarritoCabecera carrito) throws Exception {
		
		daoCarrito.update(carrito);
		
	}
	
	public void deleteCarrito(CarritoCabecera carrito) throws Exception{
		
		String com= String.valueOf(carrito.getCodigo());
		daoCarrito.delete(com);
	
	}
	
	public CarritoCabecera getCarritoFin() {
		
		List<CarritoCabecera> cabeceras = daoCarrito.getCarritoFin();
		CarritoCabecera carrito = new CarritoCabecera();
		//int size = cabecera.size();
		//carrito=cabecera.get(size-1);
		
		return carrito;
		
	}
	
	public CarritoCabecera getCarritos(String cedula){
		
		CarritoCabecera c =daoCarrito.read(cedula);
		
		return 	c;
	}
	
	public CarritoDetalle agregarDetalle(ProductoTemp productoTemp, Producto producto) {
		CarritoDetalle detalle=new CarritoDetalle();
		detalle.setCodigo(productoTemp.getCodigo());
		detalle.setCantidad(productoTemp.getCantidad());
		detalle.setPrecio(producto.getValorUnitario());
		detalle.setProducto(producto);
		
		return detalle;
		
	}
	
	public CarritoCabecera agregarProducto(Producto producto, ProductoTemp productoTemp) {
		
		CarritoCabecera carrito = new CarritoCabecera();
		
		CarritoDetalle detalle = new CarritoDetalle();
		
		if(productoTemp.getEstado().equals("nueva")) {
			
			carrito.setCodigo(1);
			System.out.println("Nueva");
		}else if(productoTemp.getEstado() == "actual"){
			carrito=getCarritoFin();
			System.out.println("Actual: "+carrito.getCodigo());
		}
		
		detalle=agregarDetalle(productoTemp, producto);
		//carrito.agregarDetalle(detalle);
		return carrito;
			
		}
	
}
