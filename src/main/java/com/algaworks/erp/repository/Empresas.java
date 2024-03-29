package com.algaworks.erp.repository;

import java.io.Serializable;
import java.util.List;

import com.algaworks.erp.model.Empresa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Empresas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public Empresas() {}
	
	public Empresas(EntityManager manager) {
		this.manager = manager;
	}
	
	public Empresa porId(Long id) {
		return manager.find(Empresa.class, id);
	}
	
	public List<Empresa> pesquisar(String nome){
		TypedQuery<Empresa> query = manager.createQuery("from Empresa where nomeFantasia like :nomeFantasia", Empresa.class);
		query.setParameter("nomeFantasia", nome + "%");
		return query.getResultList(); 
	}
	
	public Empresa guardar(Empresa empresa) {
		return manager.merge(empresa);
	}
	
	public void remover (Empresa empresa) {
		empresa = porId(empresa.getId());
		manager.remove(empresa);
	}
	

}
