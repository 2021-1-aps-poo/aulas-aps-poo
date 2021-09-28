package br.ufpb.dcx.rodrigor.aulas.controlevendas;

public class SistemaVendas {


    public static void main(String[] args) {
        ControladorVendas ctrlVendas = new ControladorVendas();

        VendasCaixaFacade caixaRodrigo = ctrlVendas.abrirCaixa("123123");
        caixaRodrigo.iniciarVenda();
        caixaRodrigo.adicionarProduto(new Produto("banana"),1);

        VendasCaixaFacade caixaMaria = ctrlVendas.abrirCaixa("2342342");
        caixaMaria.iniciarVenda();
        caixaMaria.adicionarProduto(new Produto("maca"),3);


    }
}
