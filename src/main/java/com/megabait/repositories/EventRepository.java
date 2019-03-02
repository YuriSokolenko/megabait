package com.megabait.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megabait.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	public Event findByName(String name);

}