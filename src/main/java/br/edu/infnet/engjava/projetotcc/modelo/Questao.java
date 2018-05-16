package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;

public class Questao {
 
    private long id;
    private String descricaoQuestao;
    private int grauConformidadeResposta;
    private LocalDate dataCriacao;

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
}