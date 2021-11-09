package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Porta;

public class PortaWolf implements Porta {

    private boolean aberto = false;

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
}
