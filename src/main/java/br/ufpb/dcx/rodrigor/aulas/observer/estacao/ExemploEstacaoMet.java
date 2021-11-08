package br.ufpb.dcx.rodrigor.aulas.observer.estacao;

public class ExemploEstacaoMet {


    public static void main(String[] args) {

        EstacaoMeteorologica estacaoJP = new EstacaoMeteorologica("JoaoPessoa");
        EstacaoMeteorologica estacaoRT = new EstacaoMeteorologica("Rio Tinto");
        EstacaoMeteorologica estacaoGua = new EstacaoMeteorologica("Guarabira");

        PrevisaoChuva chuva = new PrevisaoChuva();
        estacaoJP.addListener(chuva);
        estacaoRT.addListener(chuva);
        estacaoGua.addListener(chuva);

        estacaoJP.medTemperatura(26);
        estacaoRT.medTemperatura(34);
        estacaoRT.medTemperatura(28);
    }
}
