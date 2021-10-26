package br.ufpb.dcx.rodrigor.aulas.decorator.produto;

public class CalculadorImpostoDecorator implements CalculadorImposto{

    private CalculadorImposto componente;

    public CalculadorImpostoDecorator(CalculadorImposto componente){
        this.componente = componente;
    }

    @Override
    public double calcularImposto(double valor) {
        return this.componente.calcularImposto(valor);
    }
}
