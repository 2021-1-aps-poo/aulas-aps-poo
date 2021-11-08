package br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.smurfs;

import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.Porta;
import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.Sala;
import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.wolf.JogoWolf;

public class JogoSmurfs extends JogoWolf {



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
