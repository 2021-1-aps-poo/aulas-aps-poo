package br.ufpb.dcx.rodrigor.aulas.composite.rede;

public interface ElementoRede {

    public final int VERDE = 0;
    public final int AMARELO = 1;
    public final int VERMELHO = 2;

    public int getStatus();
    public String getNome();
}
