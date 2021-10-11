package br.ufpb.dcx.rodrigor.aulas.decorator.sorvete;

public class FabricaSorvete {

    public static void main(String[] args) {


        ComponenteSorvete sorvete = new CaldaSorvete("Baunilha",new BolaSorvete("Chocolate", new BolaSorvete("Morango", new Casquinha())));

        System.out.println(sorvete.getSabor());
        System.out.println(sorvete.getPreco());
    }
}
