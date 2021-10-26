package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class Casquinha implements Sorvete{


    @Override
    public String getIngredientes() {
        return "casquinha de biscoito";
    }

    @Override
    public double getPreco() {
        return 0.5;
    }
}
