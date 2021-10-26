package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class MeMsDecorator extends SorveteDecorator{


    public MeMsDecorator(Sorvete componente) {
        super(componente);
    }

    @Override
    public String getIngredientes() {
        return "M&Ms, "+super.getIngredientes();
    }

    @Override
    public double getPreco() {
        return 0.2 + super.getPreco();
    }
}
