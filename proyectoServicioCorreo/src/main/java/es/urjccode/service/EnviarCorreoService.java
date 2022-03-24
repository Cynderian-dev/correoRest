package es.urjccode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EnviarCorreoService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void enviarCorreo(String from, String to, String subject, String body) {
		SimpleMailMessage correo = new SimpleMailMessage();
		
		correo.setFrom(from);
		correo.setTo(to);
		correo.setSubject(subject);
		correo.setText(body);
		javaMailSender.send(correo);
	
	}

}
