package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.erp.model.Empresa;
import com.algaworks.erp.model.RamoAtividade;
import com.algaworks.erp.model.TipoEmpresa;
import com.algaworks.erp.repository.Empresas;
import com.algaworks.erp.repository.RamoAtividades;

import service.CadastroEmpresaService;
import util.FacesMessages;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;
	
	@Inject
	private FacesMessages messages;
	
	@Inject
	private RamoAtividades ramoAtividades;
	
	@Inject
	private CadastroEmpresaService cadastroEmpresaService;
	
	private List<Empresa> listaEmpresas;
	
	private String termoPesquisa;
	
	private Converter ramoAtividadeConverter;
	
	private Empresa empresa;
	
	public void prepararNovaEmpresa() {
		empresa = new Empresa();
	}
	
	public void salvar() {
		cadastroEmpresaService.salvar(empresa);
		
		if(jaHouvePesquisa()) {
			pesquisar();
		}
		
		messages.info("Empresa cadastrada com sucesso!");
		
	}
	
	public void pesquisar() {
		listaEmpresas = empresas.pesquisar(termoPesquisa);
		
		if(listaEmpresas.isEmpty()) {
			messages.info("Sua consulta não retornou registros.");
		}
	}
	
	public void todasEmpresas() {
		listaEmpresas = empresas.todas();
	}
	
	public List<RamoAtividade> completarRamoAtividade(String termo){
		List<RamoAtividade> listaRamoAtividades = ramoAtividades.pesquisar(termo);
		ramoAtividadeConverter = new RamoAtividadeConverter(listaRamoAtividades);
		return listaRamoAtividades;
	}
	
	private boolean jaHouvePesquisa() {
		return termoPesquisa != null && !"".equals(termoPesquisa);
	}
	
	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}
	
	public String getTermoPesquisa() {
		return termoPesquisa;
	}

	public void setTermoPesquisa(String termoPesquisa) {
		this.termoPesquisa = termoPesquisa;
	}
	
	public TipoEmpresa[] getTiposEmpresas() {
		return TipoEmpresa.values();
	}
	
	public Converter getRamoAtividadeConverter() {
		return ramoAtividadeConverter;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
}
