package br.com.projetomaisvida.entity;

import java.io.Serializable;

public class Municipio implements Serializable {

	private static final long serialVersionUID = 7598232000838253373L;
	private String id;
    private String municipio;
    private String uf;

    public Municipio() {
        super();
    }
    
    public Municipio(String municipio, String uf) {
    	this.municipio = municipio;
    	this.uf = uf;        
    }
    
    public Municipio(String id, String municipio, String uf) {
        this.id = id;
        this.municipio = municipio;
        this.uf = uf;        
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

    @Override
    public String toString() {
        return "Municipio{" +
                "id='" + id + '\'' +
                ", municipio='" + municipio + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}