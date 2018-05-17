package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Aluno extends Usuario {
    
    @Column(length=8, nullable=false)
    private String matricula;
    
    @Column(nullable=false)
    private String genero;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}