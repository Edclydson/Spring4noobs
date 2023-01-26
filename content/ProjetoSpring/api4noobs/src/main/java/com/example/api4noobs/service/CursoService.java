package com.example.api4noobs.service;

import com.example.api4noobs.model.Curso;
import com.example.api4noobs.repository.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService{
    private final CursoRepository repository;
    public CursoService(CursoRepository repository) { // OLHA A INJEÇÃO DE DEPENDENCIA VIA CONSTRUTOR AQUI GENTE
        this.repository = repository;
    }
    public void create(Curso curso){    //CREATE
        repository.save(curso);
    }
    public List<Curso> read(){  //READ
        return repository.findAll();
    }
    public Curso readOne(Long idDoCurso){   //READ ONLY ONE
        return repository.findById(idDoCurso).get();
    }
    public void update(String nomeDoCurso, Long id){ //UPDATE
        Curso cursoExistente = readOne(id);
        cursoExistente.setNomeDoCurso(nomeDoCurso);
        repository.save(cursoExistente);
    }
    public void delete(Long idDoCurso){ //DELETE
        repository.deleteById(idDoCurso);
    }
}
