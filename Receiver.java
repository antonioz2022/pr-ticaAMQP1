package com.cons.ConsApp;

import org.springframework.stereotype.Component;

@Component
public class Receiver {

    public void receiveMessage(byte[] message) {
    	String receivedText = new String(message); 
        System.out.println("Received <" + receivedText + ">");
    }


}