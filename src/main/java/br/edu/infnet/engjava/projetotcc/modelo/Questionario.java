package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questionario")
public class Questionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="identificador")
    private String identificador;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "questionario_questao", 
        joinColumns = { @JoinColumn(name = "questionario_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "questao_id") }
    )
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
