package com.triana.listaestudiantes.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "contactos")
public class Contactos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = " Por favor ingrese su direccion")
	private String direccion;
	
	@NotBlank(message = "Por favor,seleccione su ciudad")
	private String ciudad;
	
	@NotBlank(message = "Por favor,elija su estado")
	private String estado;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estudiante_id")
	private Estudiantes estudiantes;

	public Contactos() {
    }

	@PrePersist
	protected void createdAt() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void updateAt() {
		this.updatedAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Estudiantes getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiantes estudiantes) {
		this.estudiantes = estudiantes;
	}
	
}
