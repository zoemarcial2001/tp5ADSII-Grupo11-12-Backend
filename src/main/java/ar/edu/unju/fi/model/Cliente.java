package ar.edu.unju.fi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "CLIENTES")
public class Cliente{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	
	@Column(name = "num_documento")
	private String NumDocumento;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "codigo_postal")
	private String codigoPostal;
	
	@Column(name = "direccion")
	private String direccion;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "fecha_de_alta")
	private String fechaAlta;
	
	@OneToOne(mappedBy = "cliente",cascade = CascadeType.ALL)
	private Alquiler alquiler;

	
	/**
	 * 
	 */
	public Cliente() {

	}


	public Cliente(Integer idCliente, String apellido, String nombre, String tipoDocumento, String numDocumento,
			String telefono, String razonSocial, String codigoPostal, String direccion, String fechaAlta,
			Alquiler alquiler) {
		super();
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		NumDocumento = numDocumento;
		this.telefono = telefono;
		this.razonSocial = razonSocial;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
		this.alquiler = alquiler;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNumDocumento() {
		return NumDocumento;
	}


	public void setNumDocumento(String numDocumento) {
		NumDocumento = numDocumento;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public Alquiler getAlquiler() {
		return alquiler;
	}


	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}
	
}
