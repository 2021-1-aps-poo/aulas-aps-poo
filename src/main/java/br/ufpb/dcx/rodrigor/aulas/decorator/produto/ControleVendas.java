package br.ufpb.dcx.rodrigor.aulas.decorator.produto;

public class ControleVendas {

    public static void main(String[] args) {


        Produto sapato = new Produto("Sapato Importado");
        sapato.setCalculadorImposto(new ImpostoImportacao(new ICMS(new CalculadorBase())));

        Produto motorCarro = new Produto("Motor Carro");
        motorCarro.setCalculadorImposto(new IPI(new ICMS( new CalculadorBase())));
    }
}
