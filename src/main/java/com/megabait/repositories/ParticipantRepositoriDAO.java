package com.megabait.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megabait.entities.Participant;

@Repository
public interface ParticipantRepositoriDAO extends JpaRepository<Participant, Long> {

}
