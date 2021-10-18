package br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto;

import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.smurfs.JogoSmurfs;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.wolf.JogoWolf;

public class JogoLabirinto {


    public static void main(String[] args) {
        JogoWolf wolf = new JogoWolf();

        wolf.montaLabirinto();

        JogoSmurfs smurfs = new JogoSmurfs();

        smurfs.montaLabirinto();
    }
}
