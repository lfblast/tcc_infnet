package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {
    
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String codigoCurso;
    private String nomeCurso;
    private List<Bloco> blocos;
    
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