package br.ufpb.dcx.rodrigor.aulas.observer.centraltelefone;

import java.util.LinkedList;
import java.util.List;

public class CentralTelefonica {

    private List<CentralTelefonicaListener> listeners = new LinkedList<>();

    private String id;

    public CentralTelefonica(String id){
        this.id = id;
    }


    public void chamadaVoz(){
        dispararEventos(new CentralTelefonicaEvent(this, TipoChamada.VOZ));

    }

    public void chamadaFAX(){
        dispararEventos(new CentralTelefonicaEvent(this, TipoChamada.FAX));

    }

    public void chamadaDados(){
        dispararEventos(new CentralTelefonicaEvent(this, TipoChamada.DADOS));

    }


    public void dispararEventos(CentralTelefonicaEvent event){
        for(CentralTelefonicaListener listener : listeners){
            listener.novaChamada(event);
        }
    }


    public void addCentralTelefonicaListener(CentralTelefonicaListener listener){
        this.listeners.add(listener);
    }


    public String getID() {
        return this.id;
    }
}
