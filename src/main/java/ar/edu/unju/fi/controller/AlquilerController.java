package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unju.fi.model.Alquiler;
import ar.edu.unju.fi.service.IAlquilerService;
import ar.edu.unju.fi.service.IClienteService;
import ar.edu.unju.fi.service.IMaquinariaService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/alquiler"})
@RestController
public class AlquilerController {
	
	@Autowired
	IAlquilerService alquilerService;
	
	@PostMapping("/guardar")
	public Alquiler guardarAlquiler(@RequestBody Alquiler alq) {
		return alquilerService.addAlquiler(alq);
	}
	
	@GetMapping("/alquiler/lista")
	public String getListaAlquiler(Model model) {

		model.addAttribute("alquiler", alquilerService.getAlquiler());
		model.addAttribute("alquileres",alquilerService.getAllAlquiler());

		return "listaalquileres";
	}
	
	
	
}
