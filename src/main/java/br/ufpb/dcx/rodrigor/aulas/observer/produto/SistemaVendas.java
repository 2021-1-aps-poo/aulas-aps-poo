package br.ufpb.dcx.rodrigor.aulas.observer.produto;

public class SistemaVendas {

    public static void main(String[] args) {

        Produto leiteCondensado = new Produto("Leite Condensado", 10, 100);
        Produto farinha = new Produto("Farinha de Trigo", 50, 200);

        SistemaControleEstoque controleEstoque = new SistemaControleEstoque();

        leiteCondensado.addListener(controleEstoque);
        farinha.addListener(controleEstoque);

        farinha.acrescentarEstoque(100);
        farinha.retirarEstoque(70);
    }
}
