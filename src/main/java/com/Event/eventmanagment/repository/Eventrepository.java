package com.Event.eventmanagment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Event.eventmanagment.entity.Evententity;

public interface Eventrepository extends JpaRepository<Evententity ,Integer> {

	

	

	Optional<Evententity> findByNameAndPassword(String name, String password);

	 
	

	

}


