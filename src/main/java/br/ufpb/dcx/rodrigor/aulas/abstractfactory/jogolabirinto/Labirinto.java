package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Porta;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Sala;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf.PortaWolf;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf.SalaWolf;

public class Labirinto {

    public void montarLabirinto(LabirintoFactory factory){
        Sala s1 = factory.criarSala();
        s1.addParede(factory.criarParede());
        s1.addParede(factory.criarParede());
        s1.addParede(factory.criarParede());
        Parede comum = factory.criarParede();
        comum.setPorta(factory.criarPorta());
        s1.addParede(comum);

        Sala s2 = factory.criarSala();
        s2.addParede(factory.criarParede());
        s2.addParede(comum);
        Parede comum2 = factory.criarParede();
        comum2.setPorta(factory.criarPorta());
        s2.addParede(comum2);
        s2.addParede(factory.criarParede());

        Sala s3 = factory.criarSala();
        s3.addParede(comum2);
        s3.addParede(factory.criarParede());
        s3.addParede(factory.criarParede());
        s3.addParede(factory.criarParede());

    }

}
