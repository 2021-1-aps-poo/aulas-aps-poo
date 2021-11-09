package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.smurfs;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.*;

public class SmurfsFactory implements LabirintoFactory {

    public Sala criarSala(){
        return new SalaSmurfs();
    }

    public Parede criarParede(){
        return new ParedeSmurfs();
    }

    public Porta criarPorta(){
        return new PortaSmurfs();
    }
}
