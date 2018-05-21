package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email_abertura")
public class EmailAbertura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;    
    
    private String texto;
    
    @Column(name="link_avaliacao", nullable=false)
    private String linkAvaliacao;

    public EmailAbertura() {

    }

    public EmailAbertura(long id, String texto, String linkAvaliacao) {
        super();
        this.id = id;
        this.texto = texto;
        this.linkAvaliacao = linkAvaliacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLinkAvaliacao() {
        return linkAvaliacao;
    }

    public void setLinkAvaliacao(String linkAvaliacao) {
        this.linkAvaliacao = linkAvaliacao;
    }
}