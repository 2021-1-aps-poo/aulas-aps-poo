package br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Porta;

public class PortaWolf implements Porta {


    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private boolean aberto;

    public PortaWolf(boolean aberto) {
        this.aberto = aberto;
    }

    public PortaWolf() {
        aberto = false;
    }

}
