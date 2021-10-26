package br.ufpb.dcx.rodrigor.aulas.decorator.produto;

public class CalculadorBase implements CalculadorImposto{


    @Override
    public double calcularImposto(double valor) {
        return 0;
    }
}
