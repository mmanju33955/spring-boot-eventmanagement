package com.Event.eventmanagment.serviceinterface;

import java.util.List;

import com.Event.eventmanagment.model.EventDTO;

public interface Eventinterface {
	public EventDTO getEventByNameandPassword(String name, String password);

	List<EventDTO> getAll();

	String deleteById(int id);

	String getUpdateId(int id);

	EventDTO getEventId(int id);

	String postallDetails(EventDTO dto);
	

}
