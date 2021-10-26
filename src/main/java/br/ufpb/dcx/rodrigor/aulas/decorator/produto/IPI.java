package br.ufpb.dcx.rodrigor.aulas.decorator.produto;

public class IPI extends CalculadorImpostoDecorator{
    public IPI(CalculadorImposto componente) {
        super(componente);
    }

    @Override
    public double calcularImposto(double valor) {
        return (0.2 * valor) + super.calcularImposto(valor);
    }
}
