package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa {
    
    @Column(length=8)
    private String matricula;
    
    @ManyToOne
    @JoinColumn(name = "turma")
    private Turma turma;
    
    @OneToMany(mappedBy = "aluno")
    private List<Resposta> respostas;

    public Aluno() {
    }

    public Aluno(String matricula, Turma turma, List<Resposta> respostas, long id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
        this.matricula = matricula;
        this.turma = turma;
        this.respostas = respostas;
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

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }
}