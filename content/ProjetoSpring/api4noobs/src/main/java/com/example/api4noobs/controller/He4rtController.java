package com.example.api4noobs.controller;

import com.example.api4noobs.model.Curso;
import com.example.api4noobs.service.CursoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class He4rtController{

    private final CursoService service;
    public He4rtController(CursoService service) {
        this.service = service;
    }
    @PostMapping("/novo4noobs")
    public void create(@RequestBody Curso curso){
        service.create(curso);
    }
    @GetMapping("/all4noobs")
    public List<Curso> read(){
        return service.read();
    }
    @GetMapping("/this4noob/{id}")
    public ResponseEntity<Curso> readOne(@PathVariable Long id){
        return ResponseEntity.ok(service.readOne(id));
    }
    @PutMapping("/alter4noobs/{id}/{nome}")
    public ResponseEntity update(@PathVariable("nome") String nomeDoCurso, @PathVariable("id") Long id){
        service.update(nomeDoCurso,id);
        return ResponseEntity.ok("Nome do curso alterado!");
    }
    @DeleteMapping("/vaza4noobs/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

}
