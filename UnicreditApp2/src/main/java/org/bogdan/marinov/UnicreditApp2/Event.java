package org.bogdan.marinov.UnicreditApp2;

import java.util.HashMap;
import java.util.Map;

public class Event {
	
	private int Id;
	private String Name;
	
	private Map <Integer, Event> events=new HashMap<>();
    
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	
	public Event()
	{
		
	}
	
	public Event(int id, String name)
	{
		this.Id=id;
		
		this.Name=name;
	}
	
	public Map getEvents()
	{
		return events;
		
	}

}
