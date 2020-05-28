package com.redsocial.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Alumno;
import com.redsocial.servicio.AlumnoServicio;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoServicio servicio;

	
	@RequestMapping("/verAlumno")
	public String ver() {
		return "registraAlumno";
	}
	
	@RequestMapping("/registroDeAlumno")
	public String metRegistraAlumno(Alumno obj,HttpSession session) {
		Alumno aux = servicio.insertaAlumno(obj);
		if(aux == null) {
			session.setAttribute("MENSAJE", "Registro erróneo");
		}else {
			session.setAttribute("MENSAJE", "Registro exitos");
		}
		return "redirect:verAlumno";
	}


	
	
}
