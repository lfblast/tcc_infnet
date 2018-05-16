package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questionario {
    
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String identificador;
    private List<Questao> questoes;

    public Questionario() {
    	
    }
    
    public Questionario(long id, String identificador, List<Questao> questoes) {
		super();
		this.id = id;
		this.identificador = identificador;
		this.questoes = questoes;
	}


	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
}