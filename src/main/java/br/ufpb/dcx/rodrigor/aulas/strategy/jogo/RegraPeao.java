package br.ufpb.dcx.rodrigor.aulas.strategy.jogo;

public class RegraPeao implements RegraMovimentacao{

    @Override
    public boolean validarMovimento(Posicao origem, Posicao destino, Tabuleiro t) {
        return false;
    }
}
