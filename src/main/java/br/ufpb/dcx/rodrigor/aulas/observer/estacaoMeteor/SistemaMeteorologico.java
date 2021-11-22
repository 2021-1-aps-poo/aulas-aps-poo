package br.ufpb.dcx.rodrigor.aulas.observer.estacaoMeteor;

public class SistemaMeteorologico {


    public static void main(String[] args) {

        SistemaPrevisaoChuva previsaoChuva = new SistemaPrevisaoChuva();


        EstacaoListener listener = previsaoChuva;

        EstacaoMeteorologica estacao1 = new EstacaoMeteorologica();

        estacao1.addEstacaoListener(previsaoChuva);
    }
}
