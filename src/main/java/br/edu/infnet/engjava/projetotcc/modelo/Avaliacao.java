package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "avaliacao")
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
    
    @Column(name="observacoes", nullable=true)
    private String observacoes;
    
    @OneToMany(mappedBy = "avaliacao")
    private List<Resposta> respostas;
    
    @ManyToOne
    @JoinColumn (name="turma_id")
    private Turma turma;
    
    @ManyToOne
    @JoinColumn(name = "questionario_id")
    private Questionario questionario;
    
    @OneToOne
    @JoinColumn(name = "email_abertura_id")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private EmailAbertura emailAbertura;
    
    
    public Avaliacao() {
    	
    }

    public Avaliacao(long id, String codigoAvaliacao, String objetivoAvaliacao, LocalDate inicioAvaliacao, LocalDate terminoAvaliacao, String observacoes, List<Resposta> respostas, Turma turma, Questionario questionario, EmailAbertura emailAbertura) {
        this.id = id;
        this.codigoAvaliacao = codigoAvaliacao;
        this.objetivoAvaliacao = objetivoAvaliacao;
        this.inicioAvaliacao = inicioAvaliacao;
        this.terminoAvaliacao = terminoAvaliacao;
        this.observacoes = observacoes;
        this.respostas = respostas;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
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