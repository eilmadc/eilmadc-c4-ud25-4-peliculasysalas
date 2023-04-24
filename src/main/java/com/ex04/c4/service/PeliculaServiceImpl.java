/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex04.c4.dao.IPeliculaDAO;
import com.ex04.c4.dto.Pelicula;

/**
 * @author elena-01
 *
 */

@Service
public class PeliculaServiceImpl implements PeliculaService{
	
	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Pelicula> listPeliculas() {
		
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	public Pelicula peliculaByCodigo(int codigo) {
		
		return iPeliculaDAO.findById(codigo).get();
	}

	@Override
	public Pelicula updatePelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void deletePelicula(int id) {
		
		iPeliculaDAO.deleteById(id);
		
	}

}
