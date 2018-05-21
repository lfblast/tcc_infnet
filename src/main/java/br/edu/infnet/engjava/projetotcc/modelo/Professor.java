package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa {
    
    private String codigoCadastro;
    
    @OneToOne (mappedBy="professor")
    private Turma turma;

    public Professor() {
    }

    public Professor(long id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
    }
    
    public String getCodigoCadastro() {
        return codigoCadastro;
    }

    public void setCodigoCadastro(String codigoCadastro) {
        this.codigoCadastro = codigoCadastro;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }    
}