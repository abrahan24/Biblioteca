package com.ProjectLibrary.bibliotecauap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ProjectLibrary.bibliotecauap.models.entity.Persona;
import com.ProjectLibrary.bibliotecauap.models.service.IPersonaService;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @RequestMapping("/registro")
    public String registro_Persona(Model model, @RequestParam("validado")String validado){
        Persona persona = new Persona();
        model.addAttribute("persona", persona);
        return "Persona/Registro_Persona";
    }

    @RequestMapping(value = "form_persona",method = RequestMethod.POST)
    public String form_Persona(Model model,@RequestParam("id_persona")Long id_persona,@RequestParam("nombre")String nombre,@RequestParam("ap_paterno")String ap_paterno,@RequestParam("ap_materno")String ap_materno,@RequestParam("ci")String ci){
        
        return "";
    }
    

}
