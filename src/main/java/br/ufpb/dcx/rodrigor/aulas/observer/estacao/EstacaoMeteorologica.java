package br.ufpb.dcx.rodrigor.aulas.observer.estacao;


import java.util.LinkedList;
import java.util.List;

public class EstacaoMeteorologica {

    private String id;

    private List<EstacaoListener> listeners = new LinkedList<>();


    public EstacaoMeteorologica(String id){
        this.id = id;
    }

    public void medTemperatura(float temp){
        EstacaoEvent event = new EstacaoEvent(this);
        event.setTemperatura(temp);
        for(EstacaoListener listener: listeners)
            listener.novaTemperatura(event);
    }

    public void medPressao(float pressao){
        EstacaoEvent event = new EstacaoEvent(this);
        event.setPressao(pressao);
        for(EstacaoListener listener: listeners)
            listener.novaPressao(event);
    }

    public void medPrecipitacao(float precipitacao){
        EstacaoEvent event = new EstacaoEvent(this);
        event.setPrecipitacao(precipitacao);
        for(EstacaoListener listener: listeners)
            listener.novaPrecipitacao(event);
    }

    public void medVelVento(float velvento){
        EstacaoEvent event = new EstacaoEvent(this);
        event.setVelVento(velvento);
        for(EstacaoListener listener: listeners)
            listener.novaMedidaVento(event);
    }

    public void medRaiosUV(float raio){
        EstacaoEvent event = new EstacaoEvent(this);
        event.setRaioUV(raio);
        for(EstacaoListener listener: listeners)
            listener.novaMedidaRaioUV(event);
    }


    public void addListener(EstacaoListener listener){
        this.listeners.add(listener);
    }
}
