package br.edu.infnet.engjava.projetotcc.modelo;

public class Aluno extends Usuario {
    
    private String matricula;
    private String genero;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}