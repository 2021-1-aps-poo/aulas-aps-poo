package br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.smurfs;

import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.Sala;
import br.ufpb.dcx.rodrigor.aulas.factory.jogolabirinto.wolf.ParedeWolf;

import java.util.LinkedList;
import java.util.List;

public class SalaSmurfs implements Sala {

    private List<ParedeWolf> paredes = new LinkedList<>();

    public void addParede(ParedeWolf parede){
        this.paredes.add(parede);
    }

    @Override
    public void addParede(Parede parede) {

    }
}
