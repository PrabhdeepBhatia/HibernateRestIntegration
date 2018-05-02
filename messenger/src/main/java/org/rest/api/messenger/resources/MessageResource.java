package org.rest.api.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.api.messenger.model.Message;
import org.rest.api.messenger.service.MessageService;

@Path("/")
public class MessageResource {
	
	@GET
	@Path("messages")
    @Produces(MediaType.TEXT_PLAIN)
	public String getMessages(){
		return "Hello world!";		
	}
	
	

	@GET
	@Path("serviceMessages")
    @Produces(MediaType.APPLICATION_XML)
	public List<Message> getServiceMessages(){
		MessageService ms = new MessageService();
		
		return ms.getAllMessages();		
	}

}
