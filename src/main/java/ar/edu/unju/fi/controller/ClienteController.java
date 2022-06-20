package ar.edu.unju.fi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unju.fi.model.Cliente;
import ar.edu.unju.fi.service.IClienteService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/cliente"})
@RestController
public class ClienteController {

	@Autowired
	IClienteService clienteService;
	
	@PostMapping("/guardar")
	public Cliente addCliente(@RequestBody Cliente cli) {
		return clienteService.addCliente(cli);
	}
	
	@GetMapping
	public List<Cliente> getClientes(){
		return clienteService.getAllCliente();
	}
	
	
}
