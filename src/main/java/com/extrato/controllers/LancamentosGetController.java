package com.extrato.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.extrato.beans.LancamentosReply;
import com.extrato.beans.LancamentosReplyList;

/**
 * Processa a requisição GET do Extrato de lançamentos em conta
 * @return Retorna uma lista dos lançamentos
 * 
 * @author Alexandre Theodoro
 *
 */

@Controller
public class LancamentosGetController {

	/*
	 *  CrossOrigin gera o cabeçalho CORS para o endereço 8080 (somente para este teste)
	 */
	@CrossOrigin(origins = "http://localhost:8080")
	
	@RequestMapping(method = RequestMethod.GET, value="/extrato/lancamentos")

	@ResponseBody
	  public List<LancamentosReply> devolveExtrato() {
			System.out.println("Processando extrato");
			LancamentosReplyList procList = new LancamentosReplyList();
			try {
					procList.Processalanc();
				} catch (IOException e) {
					e.printStackTrace();
				}

			return LancamentosReplyList.getLancamentosCliente();
	}
}
