package br.ufpb.dcx.rodrigor.aulas.observer;

public class Telefone implements CentralTelefonicaListener{

    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public void tocar(String centralId){
        System.out.println(centralId+":"+numero+": TRIMMMMMM");
    }

    @Override
    public void novaChamada(CentralTelefonicaEvent event) {
        if(event.getTipo() != TipoChamada.VOZ) return;

        this.tocar(event.getSource().getID());
    }
}
