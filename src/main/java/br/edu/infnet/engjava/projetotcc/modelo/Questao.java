package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="descricao", nullable=false)
    private String descricaoQuestao;
    
    @Column(name="grau_conformidade_resposta", nullable=false)
    private int grauConformidadeResposta;
    
    @Column(name="data_criacao")
    private LocalDate dataCriacao;
    
    @ManyToMany(mappedBy = "questoes")
    private List<Questionario> questionarios;

    public Questao() {

    }

    public Questao(long id, String descricaoQuestao, int grauConformidadeResposta, LocalDate dataCriacao) {
        super();
        this.id = id;
        this.descricaoQuestao = descricaoQuestao;
        this.grauConformidadeResposta = grauConformidadeResposta;
        this.dataCriacao = dataCriacao;
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

    public int getGrauConformidadeResposta() {
        return grauConformidadeResposta;
    }

    public void setGrauConformidadeResposta(int grauConformidadeResposta) {
        this.grauConformidadeResposta = grauConformidadeResposta;
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
}
