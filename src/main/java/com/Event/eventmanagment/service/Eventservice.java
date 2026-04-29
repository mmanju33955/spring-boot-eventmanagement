package com.Event.eventmanagment.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Event.eventmanagment.entity.Evententity;
import com.Event.eventmanagment.exception.InvalidNameException;
import com.Event.eventmanagment.model.EventDTO;
import com.Event.eventmanagment.repository.Eventrepository;
import com.Event.eventmanagment.serviceinterface.Eventinterface;


@Service
public class Eventservice implements Eventinterface {
	@Autowired
     Eventrepository repo;
	
    @Override
	public String postallDetails(EventDTO dto) {
		Evententity entity=new Evententity();
		if(entity.getName()!=null) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
		        throw new InvalidNameException("Name must start with a capital letter");
		}
	  }
		
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setRole(dto.getRole());
		repo.save(entity);
		
		return "created Sucessfully";
		
	}
    @Override
	public EventDTO getEventId(int id) {
		Optional<Evententity> entity = repo.findById(id);
		if(entity.isPresent()) {
			EventDTO dto=new EventDTO();
			
			dto.setName(entity.get().getName());
			dto.setEmail(entity.get().getEmail());
			dto.setPassword(entity.get().getPassword());
			dto.setPassword(entity.get().getPassword());
			dto.setRole(entity.get().getRole());
			return dto;
		}
		return null;
	}
   @Override
	public String getUpdateId(int id) {
		 Optional<Evententity> entity = repo.findById(id);
		 EventDTO dto=new EventDTO();
		 if(entity.isPresent()) {
			 if(dto.getName()!=null) {
				 entity.get().setName(dto.getName());
			 }
			 if(dto.getId()!=null) {
				 entity.get().setId(dto.getId());
				 
			 }
			 if(dto.getEmail()!=null) {
				 entity.get().setEmail(dto.getEmail());
			 }
			 if(dto.getPassword()!=null) {
				 entity.get().setPassword(dto.getPassword());
			 }
			 if(dto.getRole()!=null) {
				 entity.get().setRole(dto.getRole());
			 }
			 return "Updated Successfully!";
		 }
		return "Given Id Not Found!";
	}
    @Override
	public String deleteById(int id) {
		Optional<Evententity> entity = repo.findById(id);
		if(entity.isPresent()) {
		repo.deleteById(id);
		return "deleted Successfully";
		}
		return "Given Id Not Found!";
	}
    @Override
	public List<EventDTO> getAll() {
		List<Evententity> entity = repo.findAll();
           List<EventDTO> dto = new ArrayList<>();
           for(Evententity entityee:entity) {
        	   EventDTO dto1=new EventDTO();
        	   dto1.setId(entityee.getId());
        	   dto1.setName(entityee.getName());
        	   dto1.setEmail(entityee.getEmail());
        	   dto1.setPassword(entityee.getPassword());
        	   dto1.setPhoneNumber(entityee.getPhoneNumber());
        	   dto1.setRole(entityee.getRole());
        	   dto.add(dto1);
        	   
           }
           return dto;
	}
    @Override
	public EventDTO getEventByNameandPassword(String name, String password) {
	 Optional<Evententity> entity = repo.findByNameAndPassword(name, password);
	 if(entity.isPresent()) {
			EventDTO dto=new EventDTO();
			 dto.setId(dto.getId());
			 dto.setName(dto.getName());
			 dto.setEmail(dto.getEmail());
			 dto.setPassword(dto.getPassword());
			 dto.setPhoneNumber(dto.getPhoneNumber());
			 dto.setRole(dto.getRole());
			 return dto;

		}
		return null;
	}

}
