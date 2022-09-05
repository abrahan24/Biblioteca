package com.ProjectLibrary.bibliotecauap.controller;

import java.security.Provider.Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ProjectLibrary.bibliotecauap.models.entity.Categoria;
import com.ProjectLibrary.bibliotecauap.models.entity.Idioma;
import com.ProjectLibrary.bibliotecauap.models.entity.Libro;
import com.ProjectLibrary.bibliotecauap.models.entity.Persona;
import com.ProjectLibrary.bibliotecauap.models.entity.Subcategoria;
import com.ProjectLibrary.bibliotecauap.models.entity.TipoPersona;
import com.ProjectLibrary.bibliotecauap.models.service.ICategoriaService;
import com.ProjectLibrary.bibliotecauap.models.service.IIdiomaService;
import com.ProjectLibrary.bibliotecauap.models.service.ILibroService;
import com.ProjectLibrary.bibliotecauap.models.service.IPersonaService;
import com.ProjectLibrary.bibliotecauap.models.service.ISubcategoriaService;
import com.ProjectLibrary.bibliotecauap.models.service.ITipoPersonaService;

@Controller
public class indexController {

	@Autowired
	private ILibroService libroService;
	@Autowired
	private IPersonaService personaService;
	@Autowired
	private ICategoriaService categoriaService;
	@Autowired
	private ISubcategoriaService subcategoriaService;
	@Autowired
	private IIdiomaService idiomaService;
	@Autowired
	private ITipoPersonaService tipoPersonaService;

	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET) // Pagina principal
	public String principalM() {
		

		return "Principal";
	}

	//========================================== Persona ============================================================================
	// ========= Pagina de Registro Persona=====
	@RequestMapping(value = "/personaPG", method = RequestMethod.GET) // Pagina principal
	public String PersonaM(@Validated Persona persona,Model model) {

		model.addAttribute("libro", new Libro());

		return "Persona/RegistroPersona";
	}
	// ========= funcion para guardar registro de libro=========================================================================
	@RequestMapping(value = "/registrarPersonaF", method = RequestMethod.POST) // Enviar datos de Registro a Lista
	public String RegistrarPersona(@Validated Persona persona) { //validar los datos capturados (1)
		
		personaService.save(persona);

		return "redirect:/personaPG";
	}
	// ========= Pagina de Lista de libro=========================================================================
	@RequestMapping(value = "/listaPersonaPG", method = RequestMethod.GET) // Pagina principal
	public String ListaPersonaM(Model model) {
		
		model.addAttribute("persona",  personaService.findAll()); //capturar los datos de los inputs (1) y mostrarlos en la tabla del HTML

		return "Persona/ListaPersona";
	}
	// ========= funcion para eliminar registro de libro=========================================================================
	@RequestMapping(value = "/eliminar-persona/{id_persona}")
	public String EliminarPersona(@PathVariable("id_persona")Long id_persona) {
						
		
		Persona persona = personaService.findOne(id_persona);
		
		persona.setEstado("X");
		
		personaService.save(persona);
		
		return "redirect:/listaPersonaPG";
		
	}
	// ========= funcion para editar registro de libro=========================================================================
	@RequestMapping(value = "/editar-persona/{id_persona}")
	public String EditarPersona(@PathVariable("id_persona")Long id_persona, Model model){
		
		//personaService.delete(id_persona);
		
		
		Persona persona = personaService.findOne(id_persona);
		
		model.addAttribute("persona", persona);		
		
		return "Persona/RegistroPersona";
		
	}
	// ==============================================================================================================================





	//========================================== Libro ============================================================================
	// ========= Pagina de libro=========================================================================
	@RequestMapping(value = "/libroPG", method = RequestMethod.GET) // Pagina principal
	public String Libro(@Validated Libro libro,Model model) {
		
		/*Categoria categoria = new Categoria();
		categoria.setCategoria("Fisica");
		categoria.setEstado("A");
		
		categoriaService.save(categoria);

		Subcategoria subcategoria = new Subcategoria();
		subcategoria.setSubcategoria("Fisica Nuclear");
		subcategoria.setEstado("A");
		subcategoria.setCategoria(categoria);

		subcategoriaService.save(subcategoria);
		*/

		model.addAttribute("libro", new Libro()); //capturar los datos de los inputs (1)		


		model.addAttribute("categorias", categoriaService.findAll());

		return "libro/RegistroLibro";
	}
	// ========= funcion para guardar registro de libro=========================================================================
	@RequestMapping(value = "/registrarLibroF", method = RequestMethod.POST) // Enviar datos de Registro a Lista
	public String registrarLibro(@Validated Libro libro) { //validar los datos capturados (1)
		
		libroService.save(libro);

		return "redirect:/libroPG";
	}
	// ========= Pagina de Lista de libro=========================================================================
	@RequestMapping(value = "/listaLibroPG", method = RequestMethod.GET) // Pagina principal
	public String ListaLibro(Model model) {
		
		model.addAttribute("libro", libroService.findAll()); //capturar los datos de los inputs (1) y mostrarlos en la tabla del HTML

		return "Libro/ListaLibro";
	}
	// ========= funcion para eliminar registro de libro=========================================================================
	@RequestMapping(value = "/eliminar-libro/{id_libro}")
	public String EliminarLibro(@PathVariable("id_libro")Long id_libro){
						
		
		Libro libro = libroService.findOne(id_libro);
		
		libro.setEstado("X");
		
		libroService.save(libro);
		
		return "redirect:/listaLibroPG";
		
	}
	// ========= funcion para editar registro de libro=========================================================================
	@RequestMapping(value = "/editar-libro/{id_libro}")
	public String EditarLibro(@PathVariable("id_libro")Long id_libro, Model model){
		
		//personaService.delete(id_persona);
		
		
		Libro libro = libroService.findOne(id_libro);
		
		model.addAttribute("categorias", categoriaService.findAll());
		model.addAttribute("libro", libro);		
		
		return "libro/RegistroLibro";
		
	}
	//==========================================/Libro============================================================================





	//========================================== Categoria y Subcategoria ============================================================================
	// ========= Pagina de Categoria=========================================================================
	@RequestMapping(value = "/categoriaPG", method = RequestMethod.GET) // Pagina principal
	public String CategoriaM(@Validated Categoria categoria,@Validated Subcategoria subcategoria,Model model) {
				
		model.addAttribute("categorias", new Categoria()); //capturar los datos de los inputs (1)		
		model.addAttribute("subcategorias", new Subcategoria());
		model.addAttribute("categoria", categoriaService.findAll());
		
		return "categoria/RegistrarCategoria";
	}
	// ========= funcion para inputs de la categorias =========================================================================
	@RequestMapping(value = "/registrarCategoriaF", method = RequestMethod.POST) // Enviar datos de Registro a Lista
	public String RegistrarCategoria(@Validated Categoria categoria) { //validar los datos capturados (1)
		
		categoriaService.save(categoria);

		return "redirect:/categoriaPG";
	}
	// ========= funcion para registrar Subcategorias =========================================================================
	@RequestMapping(value = "/registrarSubCategoriaF", method = RequestMethod.POST) // Enviar datos de Registro a Lista
	public String RegistrarSubCategoria(@Validated Subcategoria subcategoria) { //validar los datos capturados (1)
		
			subcategoriaService.save(subcategoria);
		
		return "redirect:/categoriaPG";
	}
	// ========= funcion para Capturar la categorias =========================================================================
	@RequestMapping(value = "/categoria/{id_categoria}")
	public String getContent1(@PathVariable(value = "id_categoria")Long id_categoria, Model model, HttpServletRequest request){
		
		model.addAttribute("subcategorias", categoriaService.findOne(id_categoria).getSubcategorias());

		return "Categoria/content :: content1";
	}
	//========================================== /Categoria ============================================================================





	//========================================== Idioma ============================================================================}
	// ========= Pagina de Idioma=========================================================================
	@RequestMapping(value = "/IdiomaPG", method = RequestMethod.GET) // Pagina principal
	public String IdiomaM(@Validated Idioma idioma,Model model) {
				
		model.addAttribute("idioma", new Idioma()); //capturar los datos de los inputs (1)		
		
		return "Ejemplar/Idioma";
	}
	// ========= funcion para registrar idioma =========================================================================
	@RequestMapping(value = "/registrarIdiomaF", method = RequestMethod.POST) // Enviar datos de Registro a Lista
	public String RegistrarIdioma(@Validated Idioma idioma) { //validar los datos capturados (1)
		
		idiomaService.save(idioma);

		return "redirect:/IdiomaPG";
	}
	// ========= Pagina de Lista de Idioma=========================================================================
	@RequestMapping(value = "/listaIdiomaPG", method = RequestMethod.GET) // Pagina principal
	public String ListaIdiomaM(Model model) {
		
		model.addAttribute("idioma",  idiomaService.findAll()); //capturar los datos de los inputs (1) y mostrarlos en la tabla del HTML

		return "Ejemplar/ListaIdioma";
	}
	// ========= funcion para eliminar registro de Idioma=========================================================================
	@RequestMapping(value = "/eliminar-Idioma/{id_idioma}")
	public String EliminarIdioma(@PathVariable("id_idioma")Long id_idioma){
						
		
		Idioma idioma = idiomaService.findOne(id_idioma);
		
		idioma.setEstado("X");
		
		idiomaService.save(idioma);
		
		return "redirect:/listaIdiomaPG";
		
	}
	// ========= funcion para editar registro de Idioma=========================================================================
	@RequestMapping(value = "/editar-Idioma/{id_idioma}")
	public String EditarIdioma(@PathVariable("id_idioma")Long id_idioma, Model model){
		
		//personaService.delete(id_persona);
		Idioma idioma = idiomaService.findOne(id_idioma);
			
		model.addAttribute("idioma", idioma);
		
		
		return "Ejemplar/Idioma";
		
	}
	//========================================== /Idioma ============================================================================}






	//========================================== Tipo Persona ============================================================================
	// ========= Pagina de TipoPersona=========================================================================
	@RequestMapping(value = "/TipoPersonaPG", method = RequestMethod.GET) // Pagina principal
	public String TipoPesonaM(@Validated TipoPersona tipoPersona,Model model) {
				
		model.addAttribute("tipoPersonaB", new TipoPersona()); //capturar los datos de los inputs (1)		
		
		return "Persona/RegistrarTipoPersona";
	}
	// ========= funcion para registrar TipoPersona =========================================================================
	@RequestMapping(value = "/TipoPersonaIdiomaF", method = RequestMethod.POST) // Enviar datos de Registro a Lista
	public String TipoPersonaIdioma(@Validated TipoPersona tipoPersona) { //validar los datos capturados (1)
		
		tipoPersonaService.save(tipoPersona);

		return "redirect:/TipoPersonaPG";
	}
	// ========= Pagina de Lista de TipoPersona=========================================================================
	@RequestMapping(value = "/listaTipoPersonaPG", method = RequestMethod.GET) // Pagina principal
	public String ListaTipoPersonaM(Model model) {
		
		model.addAttribute("tipoPersonaB",  tipoPersonaService.findAll()); //capturar los datos de los inputs (1) y mostrarlos en la tabla del HTML

		return "Persona/ListaTipoPersona";
	}
	// ========= funcion para eliminar registro de TipoPersona=========================================================================
	@RequestMapping(value = "/eliminar-tipoPersona/{id_tipopersona}")
	public String EliminarTipoPersona(@PathVariable("id_tipopersona")Long id_tipopersona){
						
		
		TipoPersona tipoPersona = tipoPersonaService.findOne(id_tipopersona);
		
		tipoPersona.setEstado("X");
		
		tipoPersonaService.save(tipoPersona);
		
		return "redirect:/listaTipoPersonaPG";
		
	}
	// ========= funcion para editar registro de TipoPersona=========================================================================
	@RequestMapping(value = "/editar-tipoPersona/{id_tipopersona}")
	public String EditarTipoPersona(@PathVariable("id_tipopersona")Long id_tipopersona, Model model){
		
		//personaService.delete(id_persona);
		TipoPersona tipoPersona = tipoPersonaService.findOne(id_tipopersona);
			
		model.addAttribute("tipoPersonaB", tipoPersona);
		
		
		return "Persona/RegistrarTipoPersona";
		
	}
	//========================================== /Tipo Persona ============================================================================
}	
	
