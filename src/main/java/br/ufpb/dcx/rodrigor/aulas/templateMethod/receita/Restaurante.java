package br.ufpb.dcx.rodrigor.aulas.templateMethod.receita;

public class Restaurante {


    public void cozinharReceitaBolo(ReceitaBolo receita){
        receita.agruparIngredientes();
        receita.misturarIngredientes();
        receita.prepararForma();
        receita.aquecerForno();
        receita.colocarFormaNoForno();
        receita.aguardarTempoAssar();
        receita.servirBolo();
    }
}
