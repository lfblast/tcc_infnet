package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;    

    @Column(name="periodo_inicio", nullable=false)
    private LocalDate periodoInicio;
    
    @Column(name="periodo_fim", nullable=false)
    private LocalDate periodoFim;
    
    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private Modulo modulo;
    
    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;
    
    @ManyToOne
    @JoinColumn (name="professor_titular_id")
    private Professor professor;
    
    @OneToMany(mappedBy = "turma")
    private List<Avaliacao> avaliacoes;

    public Turma() {

    }

    public Turma(long id, LocalDate periodoInicio, LocalDate periodoFim, Modulo modulo, List<Aluno> alunos, Professor professor, List<Avaliacao> avaliacoes) {
        this.id = id;
        this.periodoInicio = periodoInicio;
        this.periodoFim = periodoFim;
        this.modulo = modulo;
        this.alunos = alunos;
        this.professor = professor;
        this.avaliacoes = avaliacoes;
    }      
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getPeriodoInicio() {
        return periodoInicio;
    }

    public void setPeriodoInicio(LocalDate periodoInicio) {
        this.periodoInicio = periodoInicio;
    }

    public LocalDate getPeriodoFim() {
        return periodoFim;
    }

    public void setPeriodoFim(LocalDate periodoFim) {
        this.periodoFim = periodoFim;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}