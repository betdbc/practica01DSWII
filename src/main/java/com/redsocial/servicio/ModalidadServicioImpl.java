package com.redsocial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Modalidad;
import com.redsocial.repositorio.ModalidadRepositorio;

@Service
public class ModalidadServicioImpl implements ModalidadServicio{

	@Autowired
	private ModalidadRepositorio repositorio;
	
	@Override
	public Modalidad insertaModalidad(Modalidad obj) {
		return repositorio.save(obj);
	}
	
	

}
