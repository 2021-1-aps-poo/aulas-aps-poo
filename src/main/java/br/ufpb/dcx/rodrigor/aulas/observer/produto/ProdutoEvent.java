package br.ufpb.dcx.rodrigor.aulas.observer.produto;

public class ProdutoEvent {

    private Produto source;


    public ProdutoEvent(Produto produto){
        this.source = produto;
    }

    public Produto getSource() {
        return this.source;
    }
}
