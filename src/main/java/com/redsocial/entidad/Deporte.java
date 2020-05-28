package com.redsocial.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "deporte")
public class Deporte {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddeporte")
	private int idDeporte;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "deporte",fetch = FetchType.EAGER)
	private List<Modalidad> modalidades; 
	
	public int getIdDeporte() {
		return idDeporte;
	}
	public void setIdDeporte(int idDeporte) {
		this.idDeporte = idDeporte;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Modalidad> getModalidades() {
		return modalidades;
	}
	public void setModalidades(List<Modalidad> modalidades) {
		this.modalidades = modalidades;
	}
	
	
}
