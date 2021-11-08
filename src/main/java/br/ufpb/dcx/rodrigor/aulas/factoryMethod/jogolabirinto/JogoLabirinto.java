package br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto;

import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.smurfs.JogoSmurfs;
import br.ufpb.dcx.rodrigor.aulas.factoryMethod.jogolabirinto.wolf.JogoWolf;

public class JogoLabirinto {

    public static void main(String[] args) {
        JogoWolf wolf = new JogoWolf();
        wolf.montarLabirinto();

        JogoSmurfs smurfs = new JogoSmurfs();
        smurfs.montarLabirinto();
    }
}
