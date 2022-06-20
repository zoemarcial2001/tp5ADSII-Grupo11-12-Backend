package ar.edu.unju.fi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unju.fi.model.Catalogo;
import ar.edu.unju.fi.service.ICatalogoService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/catalogo"})
@RestController
public class CatalogoController{
	
	@Autowired
	ICatalogoService catalogoService;
	
	@GetMapping
	public List<Catalogo> getListaCatalogos() {
		return catalogoService.getAllCatalogos();
	}
	
}
