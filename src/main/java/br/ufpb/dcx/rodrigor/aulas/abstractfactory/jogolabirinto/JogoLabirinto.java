package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.smurfs.SmurfsFactory;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf.WolfFactory;

public class JogoLabirinto {

    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        labirinto.montarLabirinto(new WolfFactory());
        labirinto.montarLabirinto(new SmurfsFactory());
    }
}
