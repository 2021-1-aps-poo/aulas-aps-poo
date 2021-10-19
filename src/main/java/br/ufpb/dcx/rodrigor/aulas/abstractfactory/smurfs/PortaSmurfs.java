package br.ufpb.dcx.rodrigor.aulas.abstractfactory.smurfs;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Porta;

public class PortaSmurfs implements Porta {


    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private boolean aberto;

    public PortaSmurfs(boolean aberto) {
        this.aberto = aberto;
    }

    public PortaSmurfs() {
        aberto = false;
    }

}
