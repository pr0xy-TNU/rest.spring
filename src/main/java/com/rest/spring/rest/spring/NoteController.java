package com.rest.spring.rest.spring;


import com.rest.spring.rest.spring.entities.Note;
import com.rest.spring.rest.spring.exception.ResourceNotFoundException;
import com.rest.spring.rest.spring.repository.INoteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private INoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    @GetMapping("/note/{id}")
    public Note getNoteById(@PathVariable("id") Long id) {
        return noteRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", id));
    }

}
