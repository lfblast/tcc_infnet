package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa {
    
    private String codigoCadastro;
    
    @OneToMany(mappedBy = "professor")
    private List<Turma> turma;

    public Professor() {
    }

    public Professor(String codigoCadastro, List<Turma> turma, long id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
        this.codigoCadastro = codigoCadastro;
        this.turma = turma;
    }
    
    public String getCodigoCadastro() {
        return codigoCadastro;
    }

    public void setCodigoCadastro(String codigoCadastro) {
        this.codigoCadastro = codigoCadastro;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }
}