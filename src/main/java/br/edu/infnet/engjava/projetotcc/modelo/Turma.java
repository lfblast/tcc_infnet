package br.edu.infnet.engjava.projetotcc.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turma {
    
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private Modulo modulo;
    private int professorTitular;
    private LocalDate periodoInicio;
    private LocalDate periodoFim;
    private List<Aluno> alunos;
    
    public Turma() {
    	
    }

    public Turma(long id, Modulo modulo, int professorTitular, LocalDate periodoInicio, LocalDate periodoFim,
			List<Aluno> alunos) {
		super();
		this.id = id;
		this.modulo = modulo;
		this.professorTitular = professorTitular;
		this.periodoInicio = periodoInicio;
		this.periodoFim = periodoFim;
		this.alunos = alunos;
	}



	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public int getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(int professorTitular) {
        this.professorTitular = professorTitular;
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
}