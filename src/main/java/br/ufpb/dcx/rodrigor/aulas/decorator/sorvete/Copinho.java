package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class Copinho implements Sorvete{


    @Override
    public String getIngredientes() {
        return "";
    }

    @Override
    public double getPreco() {
        return 0.5;
    }
}
