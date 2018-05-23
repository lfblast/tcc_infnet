package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questao")
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="descricao", nullable=false)
    private String descricaoQuestao;
    
    @Column(name="data_criacao")
    private LocalDate dataCriacao;
    
    @ManyToMany(mappedBy = "questoes")
    private List<Questionario> questionarios;
    
    @OneToMany(mappedBy = "questao")
    private List<Resposta> respostas;

    public Questao() {

    }

    public Questao(long id, String descricaoQuestao, LocalDate dataCriacao, List<Questionario> questionarios, List<Resposta> respostas) {
        this.id = id;
        this.descricaoQuestao = descricaoQuestao;
        this.dataCriacao = dataCriacao;
        this.questionarios = questionarios;
        this.respostas = respostas;
    }   
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricaoQuestao() {
        return descricaoQuestao;
    }

    public void setDescricaoQuestao(String descricaoQuestao) {
        this.descricaoQuestao = descricaoQuestao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Questionario> getQuestionarios() {
        return questionarios;
    }

    public void setQuestionarios(List<Questionario> questionarios) {
        this.questionarios = questionarios;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }
}