package com.rest.spring.rest.spring.repository;


import com.rest.spring.rest.spring.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepository extends JpaRepository<Note, Long> {

}
