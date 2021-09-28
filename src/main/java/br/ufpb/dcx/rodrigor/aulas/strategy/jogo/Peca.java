package br.ufpb.dcx.rodrigor.aulas.strategy.jogo;

public class Peca {

    private RegraMovimentacao regraMovimentacao;

    public Peca(RegraMovimentacao regra){
        this.regraMovimentacao = regra;
    }


    public boolean validarMovimento(Posicao origem, Posicao destino, Tabuleiro t){
        return this.regraMovimentacao.validarMovimento(origem, destino, t);
    }

}
