package com.extrato.beans.legado;
/**
 * Classe Lançamentos do Cliente - classe que inicia a estrutura do json legado.
 * Faz parte do json do legado - lancamento-conta-legado.json
 * @author Alexandre Theodoro
 *
 */
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LancamentosCliente {
	
	private List<ListaControleLancamento> listaControleLancamento;

	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

}
