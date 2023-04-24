/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import com.ex04.c4.dto.Pelicula;


/**
 * @author elena-01
 *
 */
public interface PeliculaService {

	public List<Pelicula> listPeliculas(); 
	
	public Pelicula savePelicula(Pelicula pelicula);
	
	public Pelicula peliculaByCodigo(int codigo);
	
	public Pelicula updatePelicula(Pelicula pelicula); 
	
	public void deletePeliculaByCodigo(int codigo);
}
