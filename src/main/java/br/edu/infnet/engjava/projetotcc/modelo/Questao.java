package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questao {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String descricaoQuestao;
    private int grauConformidadeResposta;
    private LocalDate dataCriacao;
    
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
}