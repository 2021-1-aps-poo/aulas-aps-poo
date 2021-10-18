package br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Porta;

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
