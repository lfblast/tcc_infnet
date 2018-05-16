package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;

public class Avaliacao {
    
    private long id;
    private String codigoAvaliacao;
    private String objetivoAvaliacao;
    private LocalDate inicioAvaliacao;
    private LocalDate terminoAvaliacao;
    private Aluno respondente;
    private Turma turma;
    private Questionario questionario;
    private EmailAbertura emailAbertura;

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