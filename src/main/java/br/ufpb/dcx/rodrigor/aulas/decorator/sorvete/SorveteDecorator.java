package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class SorveteDecorator implements ComponenteSorvete{

    private ComponenteSorvete componente;

    public SorveteDecorator(){

    }

    public SorveteDecorator(ComponenteSorvete componente){
        this.componente = componente;
    }

    @Override
    public double getPreco() {
        return componente.getPreco();
    }

    @Override
    public String getSabor() {
        return componente.getSabor();
    }

    public void setComponente(ComponenteSorvete componente){
        this.componente = componente;
    }
}
