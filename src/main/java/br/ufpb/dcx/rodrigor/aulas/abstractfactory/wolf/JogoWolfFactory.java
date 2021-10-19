package br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.JogoLabirintoFactory;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Porta;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Sala;

public class JogoWolfFactory implements JogoLabirintoFactory {

    @Override
    public Parede criarParede(){
        return new ParedeWolf();
    }

    @Override
    public Porta criarPorta(boolean aberta){
        return new PortaWolf(aberta);
    }

    @Override
    public Sala criarSala(){
        return new SalaWolf();
    }

}
