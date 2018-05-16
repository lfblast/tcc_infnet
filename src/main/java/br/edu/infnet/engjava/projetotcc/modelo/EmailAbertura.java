package br.edu.infnet.engjava.projetotcc.modelo;

public class EmailAbertura {
    
    private long id;
    private String texto;
    private String linkAvaliacao;

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