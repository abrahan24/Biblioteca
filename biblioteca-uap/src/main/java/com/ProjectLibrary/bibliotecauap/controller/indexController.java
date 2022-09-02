package com.ProjectLibrary.bibliotecauap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ProjectLibrary.bibliotecauap.models.entity.TipoLibro;
import com.ProjectLibrary.bibliotecauap.models.service.ITipoLibroService;

@Controller
@RequestMapping("/tipo-libro")
public class indexController {

	@Autowired
	private ITipoLibroService tipoLibroService;
	
    
    @RequestMapping(value  = "/index",method = RequestMethod.GET) // Pagina principal
	public String principal(){
		
		
		return "Principal";
	}
	//========= Pagina de Registro Persona=====

	@RequestMapping(value  = "/registroP",method = RequestMethod.GET) // Pagina principal
	public String RegistroPersona(){
		
		
		return "/RegistroPersona";
	}

	@RequestMapping(value  = "/registroL",method = RequestMethod.GET) // Pagina principal
	public String RegistroLibro(){
		
		
		return "libro/RegistroLibro";
	}





	// MODULO DE REGISTRO TIPO LIBRO  JUAN JOSE
	@RequestMapping(value  = "/registroTL",method = RequestMethod.GET) // Pagina Tipo libro
	public String RegistroTipoLibro(Model model){
		model.addAttribute("tipolibro", new TipoLibro());
		return "libro/RegistroTipoLibro";
	}

	@RequestMapping(value = "/registroTL", method = RequestMethod.POST)
	public String RegistroTipoLibro(@Validated TipoLibro tipoLibro){

		tipoLibroService.save(tipoLibro);

		return "redirect:registroTL";
	}
	//FIN MODULO DE REGISTRO TIPO LIBRO



	//MODULO DE LISTAR TIPO LIBRO JUAN JOSE

	@RequestMapping(value  = "/listarTL",method = RequestMethod.GET) // Pagina Listar Tipo libro
	public String ListarTipoLibro(Model model){

		model.addAttribute("tipolibros",  tipoLibroService.findAll());
		return "libro/ListarTipoLibro";
	}
	//FIN MODULO DE LISTAR TIPO LIBRO JUAN JOSE




	/* 
	MODULO EDITAR TIPO LIBRO "ARREGALR"

	@RequestMapping(value = "/editar-tipolibro/{id_tipolibro}")
	public String EditarTipoLibro(@PathVariable("id_tipolibro")Long id_tipolibro, Model model){
		
		TipoLibro tipolibro = tipoLibroService.findOne(id_tipolibro);
		
		model.addAttribute("tipolibro", tipolibro);		
		
		return "/registroTL";
		
	}

	MODULO ELIMINAR TIPO LIBRO "ARREGALR"
	@RequestMapping(value = "/eliminar-tipolibro/{id_tipolibro")
	public String EliminarCurso(@PathVariable("id_tipolibro")Long id_tipolibro){
		
		//personaService.delete(id_persona);
		
		
		TipoLibro tipolibro = tipoLibroService.findOne(id_tipolibro);
		
		tipolibro.setEstado("X");
		
		tipoLibroService.save(tipolibro);
		
		return "redirect:/listarTL";
		
	}
	*/

}
