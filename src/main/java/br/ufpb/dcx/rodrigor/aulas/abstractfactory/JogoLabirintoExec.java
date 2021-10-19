package br.ufpb.dcx.rodrigor.aulas.abstractfactory;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.smurfs.JogoSmurfsFactory;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.JogoWolfFactory;

public class JogoLabirintoExec {


    public static void main(String[] args) {
        JogoLabirinto jogo = new JogoLabirinto();

        jogo.montaLabirinto(new JogoWolfFactory());

        jogo.montaLabirinto(new JogoSmurfsFactory());

    }
}
