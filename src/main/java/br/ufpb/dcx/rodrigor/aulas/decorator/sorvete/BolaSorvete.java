package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class BolaSorvete extends SorveteDecorator{

    private String sabor;

    public BolaSorvete(String sabor, ComponenteSorvete componente) {
        super(componente);
        this.sabor = sabor;
    }

    @Override
    public double getPreco(){
        return 1 + super.getPreco();
    }

    @Override
    public String getSabor(){
        return this.sabor + ","+ super.getSabor();
    }

}
