/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex04.c4.dao.ISalaDAO;
import com.ex04.c4.dto.Sala;

/**
 * @author elena-01
 *
 */

@Service
public class SalaServiceImpl implements SalaService {

	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listSalas() {

		return iSalaDAO.findAll();
	}

	@Override
	public Sala saveSala(Sala sala) {

		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaByCodigo(int codigo) {
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public Sala updateSala(Sala sala) {

		return iSalaDAO.save(sala);
	}

	@Override
	public void deleteSalaByCodigo(int codigo) {
		iSalaDAO.deleteById(codigo);

	}

}
