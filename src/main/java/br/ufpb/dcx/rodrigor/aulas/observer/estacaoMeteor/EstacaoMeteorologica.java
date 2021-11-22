package br.ufpb.dcx.rodrigor.aulas.observer.estacaoMeteor;

import java.util.LinkedList;
import java.util.List;

public class EstacaoMeteorologica {


    private List<EstacaoListener> listeners = new LinkedList<>();


    public void addEstacaoListener(EstacaoListener estacao){
        this.listeners.add(estacao);
    }


    public void novaMedicaoPrecipitacao(double precip){


    }

    public void novaMedicaoTemperatura(double temp){
    }

    public void novaMedicaoPressaoAtm(double pressao){

    }


}
