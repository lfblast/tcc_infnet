package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resposta")
public class Resposta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name = "avaliacao_id")
    private Avaliacao avaliacao;
    
    @ManyToOne
    @JoinColumn(name = "questao_id")    
    private Questao questao;
    
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    
    @Column(name="grau_conformidade")
    @Enumerated(EnumType.STRING)
    private GrauConformidadeLikert grauConformidade;

    public Resposta() {
    }

    public Resposta(long id, Avaliacao avaliacao, Questao questao, Aluno aluno, GrauConformidadeLikert grauConformidade) {
        this.id = id;
        this.avaliacao = avaliacao;
        this.questao = questao;
        this.aluno = aluno;
        this.grauConformidade = grauConformidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public GrauConformidadeLikert getGrauConformidade() {
        return grauConformidade;
    }

    public void setGrauConformidade(GrauConformidadeLikert grauConformidade) {
        this.grauConformidade = grauConformidade;
    }
}