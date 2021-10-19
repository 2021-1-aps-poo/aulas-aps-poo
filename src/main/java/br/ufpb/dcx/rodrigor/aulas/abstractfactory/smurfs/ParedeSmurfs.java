package br.ufpb.dcx.rodrigor.aulas.abstractfactory.smurfs;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Porta;

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
