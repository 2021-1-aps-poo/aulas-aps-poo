package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class SorveteDecorator implements Sorvete{

    private Sorvete componente;

    public SorveteDecorator(Sorvete componente){
        this.componente = componente;
    }

    @Override
    public String getIngredientes() {
        return this.componente.getIngredientes();
    }

    @Override
    public double getPreco() {
        return this.componente.getPreco();
    }
}
