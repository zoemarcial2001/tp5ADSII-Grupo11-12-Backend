package ar.edu.unju.fi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Component
@Entity
@Table(name = "MAQUINARIAS")
public class Maquinaria {
	
	@Id
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "fecha_adquisicion")
	private String fechaAdquisicion;
	
	@Column(name = "estado")
	private String estado;
	
	@Lob
	@Column(name = "imagen", columnDefinition = "LONGBLOB")
	private String imagen;
	
	@Column(name = "categoria")
	private String categoria;

	public Maquinaria() {

	}

	public Maquinaria(String codigo, String marca, String modelo, String fechaAdquisicion, String estado, String imagen,
			String categoria) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaAdquisicion = fechaAdquisicion;
		this.estado = estado;
		this.imagen = imagen;
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(String fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
