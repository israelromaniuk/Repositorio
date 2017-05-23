package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.senai.dao.ClienteDAO;
import br.com.senai.model.Cliente;

public class ClienteBean {

	private Cliente cliente = new Cliente();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public ClienteBean(){
		clientes = new ClienteDAO().listarClientes();
	}
	
	public String salvar(){
		new ClienteDAO().salvar(cliente);
		//clientes.add(cliente);
		clientes = new ClienteDAO().listarClientes();
		cliente = new Cliente();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente salvo com sucesso!"));
		return "cliente_list?faces-redirect=true";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
