package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 4292794256621385128L;

	private long id;
	private Date cadastroCliente = new Date();
	private String nomeCliente;
	private String cpfCliente;
	private String rgCliente;
	private char sexoCliente;
	private Integer idadeCliente;
	private String emailCliente;
	private String cepClienteCliente;
	private String bairroCliente;
	private String cidadeCliente;
	private String estadoCliente;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCadastroCliente() {
		return cadastroCliente;
	}
	public void setCadastroCliente(Date cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public char getSexoCliente() {
		return sexoCliente;
	}
	public void setSexoCliente(char sexoCliente) {
		this.sexoCliente = sexoCliente;
	}
	public Integer getIdadeCliente() {
		return idadeCliente;
	}
	public void setIdadeCliente(Integer idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getCepClienteCliente() {
		return cepClienteCliente;
	}
	public void setCepClienteCliente(String cepClienteCliente) {
		this.cepClienteCliente = cepClienteCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getEstadoCliente() {
		return estadoCliente;
	}
	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cadastroCliente=" + cadastroCliente + ", nomeCliente=" + nomeCliente
				+ ", cpfCliente=" + cpfCliente + ", rgCliente=" + rgCliente + ", sexoCliente=" + sexoCliente
				+ ", idadeCliente=" + idadeCliente + ", emailCliente=" + emailCliente + ", cepClienteCliente="
				+ cepClienteCliente + ", bairroCliente=" + bairroCliente + ", cidadeCliente=" + cidadeCliente
				+ ", estadoCliente=" + estadoCliente + "]";
	}
	
}
