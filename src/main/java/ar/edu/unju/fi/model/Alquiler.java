package ar.edu.unju.fi.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "ALQUILERES")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alquiler")
	private Integer idAlquiler;
	
	@Column(name = "fecha_alquiler")
	private String fechaAlquiler;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maquinaria_id")
	private Maquinaria maquinaria;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "fecha_devolucion")
	private String fechaDevolucion;
	
	@Column(name = "precio")
	private Double precio;
	
	

	/**
	 * 
	 */
	public Alquiler() {

	}



	public Alquiler(Integer idAlquiler, String fechaAlquiler, Cliente cliente, Maquinaria maquinaria,
			String fechaDevolucion, Double precio) {
		super();
		this.idAlquiler = idAlquiler;
		this.fechaAlquiler = fechaAlquiler;
		this.cliente = cliente;
		this.maquinaria = maquinaria;
		this.fechaDevolucion = fechaDevolucion;
		this.precio = precio;
	}



	public Integer getIdAlquiler() {
		return idAlquiler;
	}



	public void setIdAlquiler(Integer idAlquiler) {
		this.idAlquiler = idAlquiler;
	}



	public String getFechaAlquiler() {
		return fechaAlquiler;
	}



	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Maquinaria getMaquinaria() {
		return maquinaria;
	}



	public void setMaquinaria(Maquinaria maquinaria) {
		this.maquinaria = maquinaria;
	}



	public String getFechaDevolucion() {
		return fechaDevolucion;
	}



	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	/**
	 * @param idAlquiler
	 * @param fehaAlquiler
	 * @param cliente
	 * @param maquinaria
	 * @param fechaDevolucion
	 * @param precio
	 */
	


}
