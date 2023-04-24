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

import com.ex04.c4.dto.Sala;
import com.ex04.c4.service.SalaServiceImpl;

import jakarta.transaction.Transactional;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class SalaController {



	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listSalas(){
		return salaServiceImpl.listSalas();
	}
	
	
	@PostMapping("/salas")
	public Sala saveSala(@RequestBody Sala sala) {
		System.out.println("****** Este sala :"+sala);
		return salaServiceImpl.saveSala(sala);
	}
	
	@GetMapping("/salas/{codigo}")
	public Sala salaByCodigo(@PathVariable(name="codigo") int codigo) {

		return salaServiceImpl.salaByCodigo(codigo);
	}
	
	@PutMapping("/salas/{codigo}")
	public Sala updateSala(@PathVariable(name="codigo")int codigo,@RequestBody Sala sala) {
		
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= salaServiceImpl.salaByCodigo(codigo);
		
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
		
		sala_actualizado = salaServiceImpl.updateSala(sala_seleccionado);
		
		System.out.println("El sala actualizado es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@Transactional
	@DeleteMapping("/salas/{codigo}")
	public void deleteSalaByCodigo(@PathVariable(name="codigo")int codigo) {
		salaServiceImpl.deleteSalaByCodigo(codigo);
	}
	
	
	
	
	
}
