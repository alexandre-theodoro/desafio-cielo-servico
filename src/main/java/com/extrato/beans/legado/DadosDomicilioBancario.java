package com.extrato.beans.legado;

/**
 * Classe de domicilio bancario.
 * Faz parte do json do legado - lancamento-conta-legado.json
 * @author Alexandre Theodoro
 *
 */

public class DadosDomicilioBancario {
	private int codigoBanco;
	private int numeroAgencia;
	private String numeroContaCorrente;
	
	public int getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
    @Override
    public String toString(){
        return getCodigoBanco() + " Ag " + getNumeroAgencia() + " CC " + getNumeroContaCorrente();
    }
}
