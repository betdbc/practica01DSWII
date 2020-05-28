package com.redsocial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Proveedor;
import com.redsocial.repositorio.ProveedorRepositorio;

@Service
public class ProveedorServicioImpl implements ProveedorServicio{

	@Autowired
	private ProveedorRepositorio repositorio;


	@Override
	public Proveedor insertaProveedor(Proveedor obj) {
		return repositorio.save(obj);
	}
	
	

}
