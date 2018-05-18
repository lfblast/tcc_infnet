package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Administrador extends Usuario {
    
    @Column(name="numero_cadastro", length=8)
    private String numeroCadastro;

    public String getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(String numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }
}