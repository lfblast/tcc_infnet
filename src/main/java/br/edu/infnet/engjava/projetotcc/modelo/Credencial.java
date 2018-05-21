package br.edu.infnet.engjava.projetotcc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credencial")
public class Credencial {
    
    @Id
    private long id;
    
    @Column(nullable=false)    
    private String login;
    
    @Column(nullable=false)
    private String senha;

    public Credencial() {
    }

    public Credencial(long id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}