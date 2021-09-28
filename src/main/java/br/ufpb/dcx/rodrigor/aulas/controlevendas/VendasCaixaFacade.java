package br.ufpb.dcx.rodrigor.aulas.controlevendas;

public class VendasCaixaFacade {


    private ControladorVendas ctrlVendas;

    private Venda vendaAtual;

    public VendasCaixaFacade(){
        this.ctrlVendas = new ControladorVendas();
    }


    public void iniciarVenda(){
        vendaAtual = new Venda();
    }

    public void adicionarProduto(Produto p, int quant){
        vendaAtual.addProduto(p,quant);
    }

}
