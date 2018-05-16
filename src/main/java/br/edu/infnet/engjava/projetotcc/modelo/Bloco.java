package br.edu.infnet.engjava.projetotcc.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bloco {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) 
	private long id;
	private String codigoBloco;
	private String nomeBloco;
	private List<Modulo> modulos;
	
	public Bloco() {
		
	}
	
	public Bloco(long id, String codigoBloco, String nomeBloco, List<Modulo> modulos) {
		super();
		this.id = id;
		this.codigoBloco = codigoBloco;
		this.nomeBloco = nomeBloco;
		this.modulos = modulos;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigoBloco() {
		return codigoBloco;
	}

	public void setCodigoBloco(String codigoBloco) {
		this.codigoBloco = codigoBloco;
	}

	public String getNomeBloco() {
		return nomeBloco;
	}

	public void setNomeBloco(String nomeBloco) {
		this.nomeBloco = nomeBloco;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
}