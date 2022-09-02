package com.ProjectLibrary.bibliotecauap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ProjectLibrary.bibliotecauap.models.entity.Libro;
import com.ProjectLibrary.bibliotecauap.models.service.ILibroService;

@Controller
public class indexController {

	@Autowired
	private ILibroService libroService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET) // Pagina principal
	public String principal() {
		

		return "Principal";
	}
	// ========= Pagina de Registro Persona=====

	@RequestMapping(value = "/registroP", method = RequestMethod.GET) // Pagina principal
	public String RegistroPersona() {

		return "RegistroPersona";
	}

	//==========================================Libro============================================================================
	// ========= Pagina de libro=====
	@RequestMapping(value = "/Libro", method = RequestMethod.GET) // Pagina principal
	public String Libro(@Validated Libro libro,Model model) {
		
		model.addAttribute("libro", new Libro()); //capturar los datos de los inputs (1)		

		return "libro/RegistroLibro";
	}
	// ========= funcion para guardar registro de libro=====
	@RequestMapping(value = "/registrarLibro", method = RequestMethod.POST) // Enviar datos de Registro a Lista
	public String registrarLibro(@Validated Libro libro) { //validar los datos capturados (1)
		
		libroService.save(libro);

		return "redirect:Libro";
	}
	// ========= Pagina de Lista de libro=====
	@RequestMapping(value = "/listaL", method = RequestMethod.GET) // Pagina principal
	public String ListaLibro(Model model) {
		
		model.addAttribute("libro", libroService.findAll()); //capturar los datos de los inputs (1) y mostrarlos en la tabla del HTML

		return "Libro/ListaLibro";
	}
	// ========= funcion para eliminar registro de libro=====
	@RequestMapping(value = "/eliminar-libro/{id_libro}")
	public String EliminarLibro(@PathVariable("id_libro")Long id_libro){
						
		
		Libro libro = libroService.findOne(id_libro);
		
		libro.setEstado("X");
		
		libroService.save(libro);
		
		return "redirect:/listaL";
		
	}
	// ========= funcion para editar registro de libro=====
	@RequestMapping(value = "/editar-libro/{id_libro}")
	public String EditarLibro(@PathVariable("id_libro")Long id_libro, Model model){
		
		//personaService.delete(id_persona);
		
		
		Libro libro = libroService.findOne(id_libro);
		
		model.addAttribute("libro", libro);		
		
		return "libro/RegistroLibro";
		
	}
	//==========================================/Libro============================================================================
}
