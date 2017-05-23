package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.FornecedorDAO;
import br.com.senai.model.Fornecedor;

@ManagedBean
@SessionScoped
public class FornecedorBean {

	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public FornecedorBean() {
		fornecedores = new FornecedorDAO().listarFornecedores();
	}
	
	public String salvar(){
		new FornecedorDAO().salvar(fornecedor);
		//fornecedores.add(fornecedor);
		fornecedores = new FornecedorDAO().listarFornecedores();
		fornecedor = new Fornecedor();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fornecedor salvo com sucesso!"));
		return "fornecedor_list?faces-redirect=true";
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
}
