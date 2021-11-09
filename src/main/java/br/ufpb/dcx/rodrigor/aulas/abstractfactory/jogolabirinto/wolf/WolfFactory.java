package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.LabirintoFactory;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Porta;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Sala;

public class WolfFactory implements LabirintoFactory {

    public Sala criarSala(){
        return new SalaWolf();
    }

    public Parede criarParede(){
        return new ParedeWolf();
    }

    public Porta criarPorta(){
        return new PortaWolf();
    }
}
