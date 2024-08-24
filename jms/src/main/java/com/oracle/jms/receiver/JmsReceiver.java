package com.oracle.jms.receiver;

import java.time.LocalTime;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsReceiver {

	@JmsListener(destination = "test-message")
	public void receiveMessage(String message) {
		System.out.println(LocalTime.now());
		System.out.println("The message was : " + message);
	}
	
}
