package br.ufpb.dcx.rodrigor.aulas.abstractfactory;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Porta;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Sala;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.ParedeWolf;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.PortaWolf;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.SalaWolf;

public class JogoLabirinto {



    public void montaLabirinto(JogoLabirintoFactory factory){

        Sala s1 = factory.criarSala();
        Parede p1 = factory.criarParede();
        Parede p2 = factory.criarParede();
        Parede p3 = factory.criarParede();
        Parede p4 = factory.criarParede();
        p4.setPorta(factory.criarPorta(true));
        s1.addParede(p1);
        s1.addParede(p2);
        s1.addParede(p3);
        s1.addParede(p4);

        Sala s2 = factory.criarSala();
        s2.addParede(p4);
        s2.addParede(factory.criarParede());
        s2.addParede(factory.criarParede());
        s2.addParede(factory.criarParede());
    }

}
