/**
 * 
 */
package com.ex04.c4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "calificacionedad")
	private String calificacionedad;
	
	@OneToMany
	@JoinColumn(name = "pelicula")
	private List<Sala> sala;

	public Pelicula() {

	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param sala
	 */
	public Pelicula(int codigo, String nombre){
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the calificacionedad
	 */
	public String getCalificacionedad() {
		return calificacionedad;
	}

	/**
	 * @param calificacionedad the calificacionedad to set
	 */
	public void setCalificacionedad(String calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	/**
	 * @return the sala
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", sala=" + sala + "]";
	}
	
	
}
