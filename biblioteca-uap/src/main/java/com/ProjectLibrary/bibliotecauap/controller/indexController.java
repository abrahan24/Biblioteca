package com.ProjectLibrary.bibliotecauap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ProjectLibrary.bibliotecauap.models.service.IApartadoService;

@Controller
public class indexController {
    
    @RequestMapping(value  = "/index",method = RequestMethod.GET) // Pagina principal
	public String principal(){
		
		
		return "Principal";
	}



}
