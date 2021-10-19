package br.ufpb.dcx.rodrigor.aulas.abstractfactory.wolf;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.Sala;

import java.util.LinkedList;
import java.util.List;

public class SalaWolf implements Sala {

    private List<ParedeWolf> paredes = new LinkedList<>();

    public void addParede(ParedeWolf parede){
        this.paredes.add(parede);
    }

    @Override
    public void addParede(Parede parede) {

    }
}
