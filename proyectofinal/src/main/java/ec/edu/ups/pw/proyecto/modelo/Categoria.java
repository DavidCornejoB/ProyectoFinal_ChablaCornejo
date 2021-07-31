package ec.edu.ups.pw.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id
	private int codigo;
	
	@Column(length = 20, name = "cat_nombre")
	private  String nombre;

}
