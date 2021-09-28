package br.ufpb.dcx.rodrigor.aulas.strategy.jogo;

public class JogoXadrez {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.addPeca(new Peca(new RegraPeao()), new Posicao(2,1));
        //tabuleiro.addPeca(new Peca(new RegraCavalo()), new Posicao(1,2));
    }
}
