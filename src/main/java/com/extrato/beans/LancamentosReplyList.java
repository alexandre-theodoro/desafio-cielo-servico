package com.extrato.beans;
/**
 * Classe que retorna a lista de linhas a ser exibida pelo front.
 * Esta classe é a retornada pelo GET
 * @author Alexandre Theodoro
 *
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.extrato.beans.legado.CarregaJsonLegado;
import com.extrato.beans.legado.LancamentosCliente;

public class LancamentosReplyList {

	private static List<LancamentosReply> lancReply;
	
	public void Processalanc() throws IOException {
		
		CarregaJsonLegado jsonlegado = new CarregaJsonLegado();
		LancamentosCliente lanccli = null;
		lanccli = jsonlegado.leJsonLegado();
			
		lancReply = new ArrayList<LancamentosReply>();

		for (int i = 0; i < lanccli.getListaControleLancamento().size(); i++) {
			LancamentosReply lancamento = new LancamentosReply();
			lancamento.setDtlancamento(lanccli.getListaControleLancamento().get(i).getDataLancamentoContaCorrenteCliente());
			lancamento.setDescricao(lanccli.getListaControleLancamento().get(i).getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
			lancamento.setNrlancamento(lanccli.getListaControleLancamento().get(i).getLancamentoContaCorrenteCliente().getNumeroRemessaBanco());
			lancamento.setSituacao(lanccli.getListaControleLancamento().get(i).getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			lancamento.setDtconfirmacao(lanccli.getListaControleLancamento().get(i).getDataEfetivaLancamento());
			lancamento.setDadosbancarios(lanccli.getListaControleLancamento().get(i).getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().toString());
			lancamento.setVlrfinal(lanccli.getListaControleLancamento().get(i).getValorLancamentoRemessaFormatado());
			lancReply.add(lancamento);
		}

	}
	
	public static List<LancamentosReply> getLancamentosCliente() {
		return lancReply;
	}
}
