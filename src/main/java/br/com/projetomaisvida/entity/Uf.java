package br.com.projetomaisvida.entity;

import java.io.Serializable;

public class Uf implements Serializable {
	private static final long serialVersionUID = -4183125052462221846L;
	
	private String id;
    private String uf;

    public Uf() {
        super();
    }

    public Uf(String uf) {
        this.uf = uf;
    }
    
    public Uf(String id, String uf) {
        this.id = id;
        this.uf = uf;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

    @Override
    public String toString() {
        return "Uf{" +
                "id='" + id + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}