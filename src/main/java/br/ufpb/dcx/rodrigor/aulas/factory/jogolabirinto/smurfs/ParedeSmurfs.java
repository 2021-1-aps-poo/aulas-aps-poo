package br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.smurfs;

import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Porta;

public class ParedeSmurfs implements Parede {

    private Porta porta;

    public ParedeSmurfs() {
    }

    public Porta getPorta() {
        return porta;
    }

    @Override
    public void setPorta(Porta porta) {
        this.porta = porta;
    }

}
