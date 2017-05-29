package org.bogdan.marinov.UnicreditApp2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class PostClass {
	
	PostClassService post=new PostClassService();
	
	
	
	 private  Map<Integer, Event> events =  new HashMap<>();
	 
	 private Map<Integer, Event> ticket = new HashMap<>();
	
	public void setMap()
	{
		this.events.put(1,new Event(1,"Concert Beyonce"));
		
		this.events.put(2, new Event(2,"Concert Carla's Dreams"));
		
		
		
	}
	
	@POST 
	@Path("/buy_ticket")
	@Produces(MediaType.TEXT_PLAIN)
	public void buyTicket(Integer id)
	{
		
		this.ticket.put(id, events.get(id));
		
	}
	
	@POST 
	@Path("/cancel_ticket")
	@Produces(MediaType.TEXT_PLAIN)
	public void deleteTicket(Integer id)
	{
		
		this.ticket.remove(id, events.get(id));
		
	}
	
	
	@GET
	@Path("/ticket_details")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> listTicketDetails()
	{
		
		
		return new ArrayList<Event>(ticket.values());
	}
	
	@GET
	@Path("/list_events")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> listEvents()
	{
		setMap();
		
		return new ArrayList<Event>(events.values());
	}
	
	
	
	

}
