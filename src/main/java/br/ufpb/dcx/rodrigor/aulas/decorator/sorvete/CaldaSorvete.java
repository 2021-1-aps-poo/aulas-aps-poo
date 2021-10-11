package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class CaldaSorvete extends SorveteDecorator{

    private String sabor;

    public CaldaSorvete(String sabor,ComponenteSorvete componente) {
        super(componente);
        this.sabor = sabor;
    }

    @Override
    public double getPreco() {
        return 0.10 + super.getPreco();
    }

    @Override
    public String getSabor() {
        return "calda "+this.sabor+","+super.getSabor();
    }
}
