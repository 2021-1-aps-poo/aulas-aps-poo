package br.ufpb.dcx.rodrigor.aulas.observer.centraltelefone;

public class Fax implements CentralTelefonicaListener {

    public void receberDocumento(){
        System.out.println("Recebendo Documento...");
    }
    @Override
    public void novaChamada(CentralTelefonicaEvent event) {
        if(event.getTipo() != TipoChamada.FAX) return;
        this.receberDocumento();
    }
}
