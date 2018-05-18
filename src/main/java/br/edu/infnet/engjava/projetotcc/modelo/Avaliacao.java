package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;

@Entity
public class Avaliacao {
   
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    
    @Column(name="codigo_avaliacao", nullable=false)
    private String codigoAvaliacao;
    
    @Column(name="objetivo_avaliacao")
    private String objetivoAvaliacao;
        
    @Column(name="inicio_avaliacao", nullable=false)
    private LocalDate inicioAvaliacao;
    
    @Column(name="termino_avaliacao", nullable=false)
    private LocalDate terminoAvaliacao;
    
    @OneToOne
    @JoinColumn(name = "aluno_respondente")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Aluno respondente;
    
    @OneToOne
    @JoinColumn(name = "turma")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Turma turma;
    
    @OneToOne
    @JoinColumn(name = "questionario")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Questionario questionario;
    
    @OneToOne
    @JoinColumn(name = "email_abertura")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
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