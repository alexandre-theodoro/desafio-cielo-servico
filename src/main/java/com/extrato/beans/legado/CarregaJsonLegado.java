package com.extrato.beans.legado;

import java.io.File;
import java.io.IOException;

import com.extrato.beans.RetornaErroInternalException;
import com.extrato.beans.RetornaErroNotFoundException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Carrega o json do arquivo lancamento-conta-legado.json, que simula o retorno do legado
 * @return Lança uma exceção 500(erro interno), caso haja um erro no parse do arquivo
 * 		   Lança uma exceção 400(not found), caso o arquivo json não seja encontrado
 * @author Alexandre Theodoro
 *
 */
public class CarregaJsonLegado {

    public LancamentosCliente leJsonLegado()  {
        ObjectMapper objectMapper = new ObjectMapper();
        LancamentosCliente contrlanc = null;
		try {
			contrlanc = objectMapper.readValue(new File("src/main/resources/lancamento-conta-legado.json"), LancamentosCliente.class);
		} catch (JsonParseException e) {
			throw new RetornaErroInternalException(e.getMessage());
		} catch (JsonMappingException e) {
			throw new RetornaErroInternalException(e.getMessage());
		} catch (IOException e) {
			throw new RetornaErroNotFoundException(e.getMessage());
		}
        return contrlanc;
    }
}
