package com.extrato.beans;
/**
 * Classe que retorna a linha a ser exibida pelo front.
 * @author Alexandre Theodoro
 *
 */
public class LancamentosReply {
    private String dtlancamento;
    private String descricao;
    private long nrlancamento;
    private String situacao;
    private String dtconfirmacao;
    private String dadosbancarios;
    private String vlrfinal;
    
	public String getDtlancamento() {
		return dtlancamento;
	}
	public void setDtlancamento(String dtlancamento) {
		this.dtlancamento = dtlancamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getNrlancamento() {
		return nrlancamento;
	}
	public void setNrlancamento(long nrlancamento) {
		this.nrlancamento = nrlancamento;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getDtconfirmacao() {
		return dtconfirmacao;
	}
	public void setDtconfirmacao(String dtconfirmacao) {
		this.dtconfirmacao = dtconfirmacao;
	}
	public String getDadosbancarios() {
		return dadosbancarios;
	}
	public void setDadosbancarios(String dadosbancarios) {
		this.dadosbancarios = dadosbancarios;
	}

	public String getVlrfinal() {
		return vlrfinal;
	}
	public void setVlrfinal(String vlrfinal) {
		this.vlrfinal = vlrfinal;
	}
}
