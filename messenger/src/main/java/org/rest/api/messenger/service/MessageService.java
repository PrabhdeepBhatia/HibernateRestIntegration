package org.rest.api.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.rest.api.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){

		Message m1 = new Message(1,"one","Deep");
		Message m2 = new Message(2,"two","Deep");
		Message m3 = new Message(3,"three","Deep3");
		
		List<Message> messages =new ArrayList<>();
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		
		return messages;
		
		
	}
	
	
}
