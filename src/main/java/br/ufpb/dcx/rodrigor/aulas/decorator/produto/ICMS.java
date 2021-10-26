package br.ufpb.dcx.rodrigor.aulas.decorator.produto;

public class ICMS extends CalculadorImpostoDecorator{


    public ICMS(CalculadorImposto componente) {
        super(componente);
    }

    @Override
    public double calcularImposto(double valor) {
        return (0.15 * valor) + super.calcularImposto(valor);
    }
}
