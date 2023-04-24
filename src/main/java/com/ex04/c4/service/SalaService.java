/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import com.ex04.c4.dto.Sala;


/**
 * @author elena-01
 *
 */
public interface SalaService {

	public List<Sala> listSalas();

	public Sala saveSala(Sala sala);

	public Sala updateSala(Sala sala);

	public void deleteSalaByCodigo(int codigo);

	public Sala salaByCodigo(int codigo);
}
