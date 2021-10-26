package br.ufpb.dcx.rodrigor.aulas.decorator.produto;

public class ImpostoImportacao extends CalculadorImpostoDecorator{
    public ImpostoImportacao(CalculadorImposto componente) {
        super(componente);
    }

    @Override
    public double calcularImposto(double valor) {
        return (0.6 * valor) + super.calcularImposto(valor);
    }
}
