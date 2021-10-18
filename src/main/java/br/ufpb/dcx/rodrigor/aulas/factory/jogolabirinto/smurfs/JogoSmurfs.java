package br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.smurfs;

import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Porta;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Sala;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.wolf.JogoWolf;

public class JogoSmurfs extends JogoWolf {

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
