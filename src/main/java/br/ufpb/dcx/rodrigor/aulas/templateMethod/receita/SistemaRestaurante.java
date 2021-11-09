package br.ufpb.dcx.rodrigor.aulas.templateMethod.receita;

public class SistemaRestaurante {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante();

        restaurante.cozinharReceitaBolo(new ReceitaBoloChocoIngrid());
    }
}
