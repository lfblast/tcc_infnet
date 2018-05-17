package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="codigo", nullable=false)
    private String codigoModulo;
    
    @Column(name="nome")
    private String nomeModulo;

    @ManyToOne
    @JoinColumn(name = "bloco_id")
    private Bloco bloco;

    public Modulo() {

    }

    public Modulo(long id, String codigoModulo, String nomeModulo) {
        super();
        this.id = id;
        this.codigoModulo = codigoModulo;
        this.nomeModulo = nomeModulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public String getNomeModulo() {
        return nomeModulo;
    }

    public void setNomeModulo(String nomeModulo) {
        this.nomeModulo = nomeModulo;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }
}