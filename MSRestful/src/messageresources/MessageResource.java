package messageresources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import messagemodel.Message;
import messageservice.MessageService;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;

import java.util.List;


@Path("/messages")
public class MessageResource {
	
	MessageService messageservice = new MessageService();
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public List<Message> getMessages(){
		return messageservice.getAllMessages();
		
	}
	
		
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String CoolHMessage(@QueryParam("message") String message,@QueryParam("delivery_time") int delivery_time)
	{
	   System.out.println("message is " + "message");
	   System.out.println("delivery_time is " + "delivery_time");
	   String response;
	       
	if (delivery_time>0)
	{
	System.out.println("message is " + "message");
	response = "<h1> coolmessage HTML</h1>";
	}
	else
	{
	System.out.println("message is" + "nothing to print");
	response ="<h2> nothing to print HTML</h2>";
	}
	return "<html>" + "<title>" + "message scheduler" + message + "</title>" + "<body><h1>" + response
	+"</h1></body>" + "</html>";
	}

	
	@POST
	@Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.TEXT_HTML)
	public String addMessage1() {
		return "message delivered successfully with 202 Ststaus ok";
	}
	
	
	
	//to add a new message test///

	
	///further get tests and Post tests are performed on the postman tool///
	//Test1
	//Get tests http://localhost:8080/MSRestful/rest/messages/1///
	//this will fetch the first message	 successfully returned with status 200 ok
	
	//Test2
	//Get tests http://localhost:8080/MSRestful/rest/messages/2//
	//this will fetch the first message	successfully returned with status 200 ok
	//Test3
	//POST tests http://localhost:8080/MSRestful/rest/messages when we send //
	//it returns message delivered successfully with 200Ststaus ok// with the header as content-type and application/HTML as the value.
	
	//
	
	
}
