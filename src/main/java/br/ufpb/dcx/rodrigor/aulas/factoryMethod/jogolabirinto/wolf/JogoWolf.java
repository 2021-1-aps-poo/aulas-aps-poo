package br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.Porta;
import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.Sala;

public class JogoWolf {

    public void montarLabirinto(){
        Sala s1 = criarSala();
        s1.addParede(criarParede());
        s1.addParede(criarParede());
        s1.addParede(criarParede());
        Parede comum = criarParede();
        comum.setPorta(criarPorta());
        s1.addParede(comum);

        Sala s2 = criarSala();
        s2.addParede(criarParede());
        s2.addParede(comum);
        Parede comum2 = criarParede();
        comum2.setPorta(criarPorta());
        s2.addParede(comum2);
        s2.addParede(criarParede());

        Sala s3 = criarSala();
        s3.addParede(comum2);
        s3.addParede(criarParede());
        s3.addParede(criarParede());
        s3.addParede(criarParede());

    }
    
    public Sala criarSala(){
        return new SalaWolf();
    }
    
    public Parede criarParede(){
        return criarParede();
    }

    public Porta criarPorta(){
        return new PortaWolf();
    }
}
