package br.ufpb.dcx.rodrigor.aulas.controlevendas;

import java.util.HashMap;
import java.util.Map;

public class ControladorVendas {

    private ConexaoBancoDados bd;

    private Map<String,VendasCaixaFacade> caixasAbertos = new HashMap<>();

    public ControladorVendas(){
        this.bd = new ConexaoBancoDados();
    }

    public void registrarVenda(Venda venda){
        bd.inserirVenda(venda);
    }

    public VendasCaixaFacade abrirCaixa(String matriculaCaixa) {
        VendasCaixaFacade caixaFacade = new VendasCaixaFacade();
        this.caixasAbertos.put(matriculaCaixa,caixaFacade);
        return caixaFacade;
    }
}
