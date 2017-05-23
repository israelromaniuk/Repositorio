package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

public class Produto implements Serializable {

	private static final long serialVersionUID = -3448478794383986221L;

	private long id;
	private Date cadastroProduto = new Date();
	private String nomeProduto;
	private String descricaoProduto;
	private double precoProduto;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCadastroProduto() {
		return cadastroProduto;
	}
	public void setCadastroProduto(Date cadastroProduto) {
		this.cadastroProduto = cadastroProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
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
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", cadastroProduto=" + cadastroProduto + ", nomeProduto=" + nomeProduto
				+ ", descricaoProduto=" + descricaoProduto + ", precoProduto=" + precoProduto + "]";
	}
	
}
