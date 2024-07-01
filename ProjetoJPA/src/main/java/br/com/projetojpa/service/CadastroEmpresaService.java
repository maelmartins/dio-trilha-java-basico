package br.com.projetojpa.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.projetojpa.model.Empresa;
import br.com.projetojpa.repository.Empresas;
import jakarta.transaction.Transactional;

public class CadastroEmpresaService implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;
	
	@Transactional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}
	
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}
}
