package br.ufpb.dcx.rodrigor.aulas.observer.produto;

public interface ProdutoListener {

    void estoqueAtualizado(ProdutoEvent event);
    void estoqueBaixo(ProdutoEvent event);
    void estoqueAlto(ProdutoEvent event);
}
