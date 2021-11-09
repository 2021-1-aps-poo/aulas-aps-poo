package br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.wolf;

import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Parede;
import br.ufpb.dcx.rodrigor.aulas.abstractfactory.jogolabirinto.Sala;

import java.util.ArrayList;
import java.util.List;

public class SalaWolf implements Sala {

    private List<ParedeWolf> paredes = new ArrayList<>();

    @Override
    public void addParede(Parede parede) {
        paredes.add((ParedeWolf) parede);
    }
}
