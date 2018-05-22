package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa {
    
    @Column(length=8)
    private String matricula;
    
    @ManyToOne
    @JoinColumn(name = "turma")
    private Turma turma;

    public Aluno() {
    }

    public Aluno(String matricula, Turma turma, long id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
        this.matricula = matricula;
        this.turma = turma;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}