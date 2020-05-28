package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Deporte;
import com.redsocial.repositorio.DeporteRepositorio;

@Service
public class DeporteServicioImpl implements DeporteServicio {

	@Autowired
	private DeporteRepositorio repositorio;
	
	@Override
	public List<Deporte> listaDeporte() {
		return repositorio.findAll();
	}

}
