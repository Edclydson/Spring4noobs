package com.example.api4noobs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "4noobs_tb")
public class Curso{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDoCurso;
    private String nomeDoCurso;
    private String autorDoCurso;
    private String linkDoCurso;


    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getAutorDoCurso() {
        return autorDoCurso;
    }

    public void setAutorDoCurso(String autorDoCurso) {
        this.autorDoCurso = autorDoCurso;
    }

    public String getLinkDoCurso() {
        return linkDoCurso;
    }

    public void setLinkDoCurso(String linkDoCurso) {
        this.linkDoCurso = linkDoCurso;
    }

    public Long getIdDoCurso() {
        return idDoCurso;
    }

    public void setIdDoCurso(Long idDoCurso){
        this.idDoCurso = idDoCurso;
    }
}
