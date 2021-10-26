package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class Sorveteria {

    public static void main(String[] args) {

        printSorvete(new Casquinha());
        printSorvete(new Copinho());

        Sorvete chocolate = new BolaSorvete("Chocolate",new Casquinha());
        printSorvete(chocolate);

        Sorvete morangoChoco = new MeMsDecorator(new BolaSorvete("Morango", new BolaSorvete("Chocolate", new Casquinha())));

        printSorvete(morangoChoco);
    }

    public static void printSorvete(Sorvete sorvete){
        System.out.println("---- SORVETE: -----");
        System.out.println("Ingredientes: "+sorvete.getIngredientes());
        System.out.println("Preço: "+sorvete.getPreco());
        System.out.println("-------------------");
    }

}
