/**
 * 
 */
package com.ex04.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex04.c4.dto.Pelicula;
import com.ex04.c4.service.PeliculaServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;

	@GetMapping("/peliculas")
	public List<Pelicula> listDepartmentos() {
		return peliculaServiceImpl.listPeliculas();
	}

	@PostMapping("/peliculas")
	public Pelicula savePelicula(@RequestBody Pelicula pelicula) {

		return peliculaServiceImpl.savePelicula(pelicula);
	}

	@GetMapping("/peliculas/{codigo}")
	public Pelicula peliculaByCodigo(@PathVariable(name = "codigo") int codigo) {

		return peliculaServiceImpl.peliculaByCodigo(codigo);
	}

	@PutMapping("/peliculas/{codigo}")
	public Pelicula updatePelicula(@PathVariable(name = "codigo") int codigo, @RequestBody Pelicula pelicula) {

		Pelicula pelicula_seleccionado = new Pelicula();
		Pelicula pelicula_actualizado = new Pelicula();

		pelicula_seleccionado = peliculaServiceImpl.peliculaByCodigo(codigo);

		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacionedad(pelicula.getCalificacionedad());

		pelicula_actualizado = peliculaServiceImpl.updatePelicula(pelicula_seleccionado);

		return pelicula_actualizado;
	}

	@DeleteMapping("/peliculas/{codigo}")
	public void deletePelicula(@PathVariable(name = "codigo") int codigo) {
		peliculaServiceImpl.deletePelicula(codigo);
	}

}
