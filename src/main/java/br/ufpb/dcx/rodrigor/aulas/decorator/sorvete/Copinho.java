package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class Copinho implements ComponenteSorvete{
    @Override
    public double getPreco() {
        return 0.5;
    }

    @Override
    public String getSabor() {
        return "";
    }
}
