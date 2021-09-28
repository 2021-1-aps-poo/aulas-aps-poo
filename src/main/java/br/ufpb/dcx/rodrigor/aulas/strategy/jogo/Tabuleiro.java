package br.ufpb.dcx.rodrigor.aulas.strategy.jogo;

public class Tabuleiro {

    private static final int TAM_TABULEIRO = 8;

    private Peca[][] tabuleiro = new Peca[TAM_TABULEIRO][TAM_TABULEIRO];


    private void mover(Posicao origem, Posicao destino){
        Peca peca = tabuleiro[origem.linha][origem.coluna];
        if(peca == null) throw new TabuleiroException("Não existe peça na posição informada");
        // TODO: validar posicoes: valores negativos e valores maiores que o
        // tamanho do tabuleiro...
        if(peca.validarMovimento(origem,destino,this)){
            tabuleiro[destino.linha][destino.coluna] = peca;
            tabuleiro[origem.linha][origem.coluna] = null;
        }
    }

    public void addPeca(Peca peca, Posicao posicao){
        // testes de sanidade
        this.tabuleiro[posicao.linha][posicao.coluna] = peca;
    }
}
