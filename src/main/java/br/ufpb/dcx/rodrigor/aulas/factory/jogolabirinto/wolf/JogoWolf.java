package br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Porta;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Sala;

public class JogoWolf {



    public void montaLabirinto(){

        Sala s1 = criarSala();
        Parede p1 = criarParede();
        Parede p2 = criarParede();
        Parede p3 = criarParede();
        Parede p4 = criarParede();
        p4.setPorta(criarPorta(true));
        s1.addParede(p1);
        s1.addParede(p2);
        s1.addParede(p3);
        s1.addParede(p4);

        Sala s2 = criarSala();
        s2.addParede(p4);
        s2.addParede(criarParede());
        s2.addParede(criarParede());
        s2.addParede(criarParede());
    }

    public Parede criarParede(){
        return new ParedeWolf();
    }

    public Porta criarPorta(boolean aberta){
        return new PortaWolf(aberta);
    }

    public Sala criarSala(){
        return new SalaWolf();
    }

}
