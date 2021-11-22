package br.ufpb.dcx.rodrigor.aulas.observer.produto;

public class SistemaControleEstoque implements ProdutoListener{



    public void suspenderFornecimentoDeProduto(Produto produto){
        // sdf klsij
    }

    public void realizarCompraDeProduto(Produto produto){
        //
    }

    @Override
    public void estoqueAtualizado(ProdutoEvent event) {

    }

    @Override
    public void estoqueBaixo(ProdutoEvent event) {
        System.out.println("Estoque Baixo!"+event.getSource());
        this.realizarCompraDeProduto(event.getSource());
    }

    @Override
    public void estoqueAlto(ProdutoEvent event) {
        System.out.println("Estoque Alto!"+event.getSource());
        this.suspenderFornecimentoDeProduto(event.getSource());
    }
}
