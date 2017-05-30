package br.com.projetomaisvida.entity;

import java.io.Serializable;

public class Medico implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -95825532408339942L;
	
	private String id;
    private String primeiroNome;
    private String ultimoNome;
    private String email;
    private String senha;
    private int status;
    private String uf;
    private String municipio;
    private boolean ativo;
    private String especialidade;

    public Medico() {
        super();
    }
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
    @Override
    public String toString() {
        return "Medico{" +
                "id='" + id + '\'' +
                ", primeiroNome='" + primeiroNome + '\'' +
               ", ultimoNome='" + ultimoNome + '\'' +
               ", email='" + email + '\'' +
               ", senha='" + senha + '\'' +
               ", status='" + status + '\'' +
               ", uf='" + uf + '\'' +
               ", municipio='" + municipio + '\'' +
               ", ativo='" + ativo + '\'' +
               ", especialidade='" + especialidade + '\'' +
                '}';
    }
}