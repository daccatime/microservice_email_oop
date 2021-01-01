package com.naturalprogrammer.spring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class SmtpMailSender implements MailSender {
	
	private static Log log = LogFactory.getLog(SmtpMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		
		log.info("Sending SMTP mail to " + to);
		log.info("with subject " + subject);
		log.info("and body " + body);
	}

}
