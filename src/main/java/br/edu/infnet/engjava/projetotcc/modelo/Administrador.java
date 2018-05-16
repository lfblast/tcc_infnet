package br.edu.infnet.engjava.projetotcc.modelo;

public class Administrador extends Usuario {
    
    private String numeroCadastro;

    public String getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(String numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }
}