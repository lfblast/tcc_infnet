package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="codigo", nullable=false)
    private String codigoCurso;
    
    @Column(name="nome", nullable=false)
    private String nomeCurso;

    @OneToMany(mappedBy = "curso")
    private List<Bloco> blocos = new ArrayList<>();

    public Curso() {

    }

    public Curso(long id, String codigoCurso, String nomeCurso, List<Bloco> blocos) {
        super();
        this.id = id;
        this.codigoCurso = codigoCurso;
        this.nomeCurso = nomeCurso;
        this.blocos = blocos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<Bloco> blocos) {
        this.blocos = blocos;
    }
}
