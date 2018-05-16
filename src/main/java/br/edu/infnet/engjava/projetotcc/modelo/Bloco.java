package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.List;

public class Bloco {
    
    private long id;
    private String codigoBloco;
    private String nomeBloco;
    private List<Modulo> modulos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoBloco() {
        return codigoBloco;
    }

    public void setCodigoBloco(String codigoBloco) {
        this.codigoBloco = codigoBloco;
    }

    public String getNomeBloco() {
        return nomeBloco;
    }

    public void setNomeBloco(String nomeBloco) {
        this.nomeBloco = nomeBloco;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }
}