package br.ufpb.dcx.rodrigor.aulas.abstractfactory.smurfs;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Sala;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf.ParedeWolf;

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
