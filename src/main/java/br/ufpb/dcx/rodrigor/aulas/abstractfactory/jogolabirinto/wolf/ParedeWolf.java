package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Porta;

public class ParedeWolf implements Parede {

    private PortaWolf porta;

    @Override
    public void setPorta(Porta portaWolf) {
        this.porta = (PortaWolf) portaWolf;
    }
}
