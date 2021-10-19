package br.ufpb.dcx.rodrigor.aulas.abstractfactory.smurfs;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.JogoLabirintoFactory;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Porta;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Sala;

public class JogoSmurfsFactory implements JogoLabirintoFactory {

    @Override
    public Parede criarParede() {
        return new ParedeSmurfs();
    }

    @Override
    public Porta criarPorta(boolean aberta) {
        return new PortaSmurfs(aberta);
    }

    @Override
    public Sala criarSala() {
        return new SalaSmurfs();
    }
}
