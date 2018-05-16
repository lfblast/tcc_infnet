package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avaliacao {
    
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String codigoAvaliacao;
    private String objetivoAvaliacao;
    private LocalDate inicioAvaliacao;
    private LocalDate terminoAvaliacao;
    private Aluno respondente;
    private Turma turma;
    private Questionario questionario;
    private EmailAbertura emailAbertura;
    
    
    public Avaliacao() {
    	
    }

    public Avaliacao(long id, String codigoAvaliacao, String objetivoAvaliacao, LocalDate inicioAvaliacao,
			LocalDate terminoAvaliacao, Aluno respondente, Turma turma, Questionario questionario,
			EmailAbertura emailAbertura) {
		super();
		this.id = id;
		this.codigoAvaliacao = codigoAvaliacao;
		this.objetivoAvaliacao = objetivoAvaliacao;
		this.inicioAvaliacao = inicioAvaliacao;
		this.terminoAvaliacao = terminoAvaliacao;
		this.respondente = respondente;
		this.turma = turma;
		this.questionario = questionario;
		this.emailAbertura = emailAbertura;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(String codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public String getObjetivoAvaliacao() {
        return objetivoAvaliacao;
    }

    public void setObjetivoAvaliacao(String objetivoAvaliacao) {
        this.objetivoAvaliacao = objetivoAvaliacao;
    }

    public LocalDate getInicioAvaliacao() {
        return inicioAvaliacao;
    }

    public void setInicioAvaliacao(LocalDate inicioAvaliacao) {
        this.inicioAvaliacao = inicioAvaliacao;
    }

    public LocalDate getTerminoAvaliacao() {
        return terminoAvaliacao;
    }

    public void setTerminoAvaliacao(LocalDate terminoAvaliacao) {
        this.terminoAvaliacao = terminoAvaliacao;
    }

    public Aluno getRespondente() {
        return respondente;
    }

    public void setRespondente(Aluno respondente) {
        this.respondente = respondente;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Questionario getQuestionario() {
        return questionario;
    }

    public void setQuestionario(Questionario questionario) {
        this.questionario = questionario;
    }

    public EmailAbertura getEmailAbertura() {
        return emailAbertura;
    }

    public void setEmailAbertura(EmailAbertura emailAbertura) {
        this.emailAbertura = emailAbertura;
    }
}