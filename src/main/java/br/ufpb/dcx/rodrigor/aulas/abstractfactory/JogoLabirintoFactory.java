package br.ufpb.dcx.rodrigor.aulas.abstractfactory;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.ParedeWolf;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.PortaWolf;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.SalaWolf;

public interface JogoLabirintoFactory {

    public Parede criarParede();

    public Porta criarPorta(boolean aberta);

    public Sala criarSala();

}
