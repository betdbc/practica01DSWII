package com.redsocial.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "modalidad")
public class Modalidad {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idModalidad;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "numHombres")
	private int numHombres;
	
	@Column(name = "numMujeres")
	private int numMujeres;
	
	@Column(name = "edadMaxima")
	private int edadMaxima;
	
	@Column(name = "edadMinima")
	private int edadMinima;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "idDeporte")
	private Deporte deporte;
	
	public int getIdModalidad() {
		return idModalidad;
	}
	public void setIdModalidad(int idModalidad) {
		this.idModalidad = idModalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumHombres() {
		return numHombres;
	}
	public void setNumHombres(int numHombres) {
		this.numHombres = numHombres;
	}
	public int getNumMujeres() {
		return numMujeres;
	}
	public void setNumMujeres(int numMujeres) {
		this.numMujeres = numMujeres;
	}
	public int getEdadMaxima() {
		return edadMaxima;
	}
	public void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public Deporte getDeporte() {
		return deporte;
	}
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	
}
