package ar.edu.unju.fi.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@Table(name = "CATALOGOS")
public class Catalogo {

	@Id
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "fecha_vigencia")
	//@Temporal(value = TemporalType.DATE)
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	private String fechaVigencia;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name= "categoriaMaquinaria")
	private String categoriaMaquinaria;

	/**
	 * 
	 */
	public Catalogo() {

	}


	public Catalogo(String codigo, String fechaVigencia, String descripcion, String imagen, String categoriaMaquinaria) {
		super();
		this.codigo = codigo;
		this.fechaVigencia = fechaVigencia;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.categoriaMaquinaria = categoriaMaquinaria;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getFechaVigencia() {
		return fechaVigencia;
	}


	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getCategoriaMaquinaria() {
		return categoriaMaquinaria;
	}


	public void setCategoriaMaquinaria(String categoriaMaquinaria) {
		this.categoriaMaquinaria = categoriaMaquinaria;
	}
	
}
