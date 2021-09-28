package br.ufpb.dcx.rodrigor.aulas.strategy.jogo;

public interface RegraMovimentacao {

    boolean validarMovimento(Posicao origem, Posicao destino, Tabuleiro t);
}
