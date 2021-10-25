package br.ufpb.dcx.rodrigor.aulas.observer;

public class CentralTelefonicaEvent {

    private TipoChamada tipoChamada;
    private CentralTelefonica source;

    public CentralTelefonicaEvent(CentralTelefonica source,TipoChamada tipo){
        this.source = source;
        this.tipoChamada = tipo;
    }

    public TipoChamada getTipo(){
        return this.tipoChamada;
    }

    public void setSource(CentralTelefonica source) {
        this.source = source;
    }

    public CentralTelefonica getSource(){
        return this.source;
    }
}
