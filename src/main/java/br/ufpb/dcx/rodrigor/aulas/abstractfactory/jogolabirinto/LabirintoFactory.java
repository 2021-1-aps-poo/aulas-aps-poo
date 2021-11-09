package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf.PortaWolf;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf.SalaWolf;

public interface LabirintoFactory {

    public Sala criarSala();

    public Parede criarParede();

    public Porta criarPorta();

}
