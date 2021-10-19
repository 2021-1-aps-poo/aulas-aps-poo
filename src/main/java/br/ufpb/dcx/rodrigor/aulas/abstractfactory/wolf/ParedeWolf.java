package br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Porta;

public class ParedeWolf implements Parede {

    private Porta porta;

    public ParedeWolf() {
    }

    public Porta getPorta() {
        return porta;
    }

    @Override
    public void setPorta(Porta porta) {
        this.porta = porta;
    }

}
