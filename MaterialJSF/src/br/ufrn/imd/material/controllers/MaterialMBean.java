package br.ufrn.imd.material.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.material.dominio.Material;
import br.ufrn.imd.material.dominio.StatusMaterial;
import br.ufrn.imd.material.repositorios.ClassificacaoMaterialRepositorio;
import br.ufrn.imd.material.repositorios.MaterialRepositorio;

@Named
@SessionScoped
public class MaterialMBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Material material;
	private DataModel<Material> materiaisModel;
	
	@Inject
	private UsuarioMBean usuarioMBean;
	
	@Inject
	private MaterialRepositorio materialRepositorio;
	
	public MaterialMBean() {
		material = new Material();
	}
	
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public DataModel<Material> getMateriaisModel() {
		return materiaisModel;
	}

	public void setMateriaisModel(DataModel<Material> materiaisModel) {
		this.materiaisModel = materiaisModel;
	}

	public UsuarioMBean getUsuarioMBean() {
		return usuarioMBean;
	}

	public void setUsuarioMBean(UsuarioMBean usuarioMBean) {
		this.usuarioMBean = usuarioMBean;
	}

	public String novoMaterial() {
		material = new Material();
		return "/pages/material/form.jsf";
	}
	
	public String listarMaterial() {
		materiaisModel = new ListDataModel<Material>(materialRepositorio.listaMateriais());
		return "/pages/material/list.jsf";
	}
	
	public String cadastrarMaterial() {
		material.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		materialRepositorio.adicionar(material);
		material = new Material();
		return "/pages/material/form.jsf";
	}
	
	public String removerMaterial() {
		Material materialRemovido = materiaisModel.getRowData();
		materialRepositorio.remover(materialRemovido);
		materiaisModel = new ListDataModel<Material>(materialRepositorio.listaMateriais());
		return "/pages/material/list.jsf";
	}
	
	
}
