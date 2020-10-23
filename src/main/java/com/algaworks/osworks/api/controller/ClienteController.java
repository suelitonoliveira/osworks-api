package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
				
		var cliente1 = new Cliente(1l,"Teste1", "teste1@gmail.com", "99999999");
		
		
		var cliente2 =  new Cliente(2l,"Teste2", "teste2@gmail.com", "99999999");
		
		return Arrays.asList(cliente1,cliente2);
		
	}
	
	
}
