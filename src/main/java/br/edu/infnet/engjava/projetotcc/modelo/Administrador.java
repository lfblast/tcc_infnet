package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "administrador")
public class Administrador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;    
    
    @Column(name="numero_cadastro", length=8)
    private String numeroCadastro;
    
    @OneToOne
    @JoinColumn(name = "credencial_id")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Credencial credencial;

    public Administrador() {
    }

    public Administrador(long id, String numeroCadastro, Credencial credencial) {
        this.id = id;
        this.numeroCadastro = numeroCadastro;
        this.credencial = credencial;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(String numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }
}