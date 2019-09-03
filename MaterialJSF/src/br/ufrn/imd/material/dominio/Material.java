package br.ufrn.imd.material.dominio;

import java.util.Date;

public class Material {
	
	private int id;
	private String codigo;
	private String descricao;
	private Date dataCadastro;
	private Usuario usuarioCadastro;
	private ClassificacaoMaterial classificacaoMaterial;
	private GrupoMaterial grupoMaterial;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Usuario getUsuarioCadastro() {
		return usuarioCadastro;
	}
	public void setUsuarioCadastro(Usuario usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
	}
	
	public ClassificacaoMaterial getClassificacaoMaterial() {
		return classificacaoMaterial;
	}
	public void setClassificacaoMaterial(ClassificacaoMaterial classificacaoMaterial) {
		this.classificacaoMaterial = classificacaoMaterial;
	}
	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}
	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}
	
}
