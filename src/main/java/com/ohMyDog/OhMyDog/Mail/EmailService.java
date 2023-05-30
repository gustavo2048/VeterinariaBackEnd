package com.ohMyDog.OhMyDog.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmailService {

	@Autowired
	JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String email;
	
	public void sendListEmail(String emailTo) {
		MimeMessage message = javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper =  new MimeMessageHelper(message,true);
			helper.setFrom(email);
			helper.setTo(emailTo);
			helper.setSubject("Subject email");
			helper.setText("Estimado cliente este es un mail de prueba de la veterinaria OhMyDog");
			
			javaMailSender.send(message);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
}
