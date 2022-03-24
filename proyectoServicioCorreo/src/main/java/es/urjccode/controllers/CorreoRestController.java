package es.urjccode.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import es.urjccode.service.EnviarCorreoService;

@RestController
public class CorreoRestController {
	
	@Autowired
	private EnviarCorreoService enviarCorreoService;
	
	@PostMapping("/correos")
	public void enviarCorreo() {
		enviarCorreoService.enviarCorreo("correo@gmail.com", "otro", "prueba asunto", "prueba texto");
		
	}

}
