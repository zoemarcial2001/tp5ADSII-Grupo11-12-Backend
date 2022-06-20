package ar.edu.unju.fi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unju.fi.model.Maquinaria;
import ar.edu.unju.fi.service.IMaquinariaService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/maquinaria"})
@RestController
public class MaquinariaController {
	
	@Autowired
	IMaquinariaService maquinariaService;
	
	@PostMapping("/guardar")
	public Maquinaria saveMaquinaria(@RequestBody Maquinaria maq){
		
		return maquinariaService.addMaquinaria(maq);
		
	}
	
	@GetMapping
	public List<Maquinaria> getListaMaquinarias() {
		return maquinariaService.getAllMaquinaria();
	}
	
	/*
	 * 
    {
        "codigo": "CO7364",
        "marca": "Volvo",
        "modelo": "UFD7304",
        "fechaAdquisicion": "15/7/2018",
        "estado": "disponible",
        "imagen": "http://resource.lonking.cn/images/201311/20131105162227942hydraulicexcavator.jpg"
    }
	 */
	
}
