package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class BolaSorvete extends SorveteDecorator{

    private String sabor;

    public BolaSorvete(Sorvete componente) {
        super(componente);
    }

    public BolaSorvete(String sabor, Sorvete componente){
        this(componente);
        this.sabor = sabor;
    }

    @Override
    public double getPreco() {
        return 1.0 + super.getPreco();
    }

    @Override
    public String getIngredientes() {
        return "bola sabor "+this.sabor+", "+super.getIngredientes();
    }
}
