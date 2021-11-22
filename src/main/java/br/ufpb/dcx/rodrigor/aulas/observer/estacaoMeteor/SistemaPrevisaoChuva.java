

package br.ufpb.dcx.rodrigor.aulas.observer.estacaoMeteor;

public class SistemaPrevisaoChuva implements EstacaoListener{

    public void informarPrecipitacao(double prec){
        // ...
    }
    public void calcularProbChuva(){
    }
    @Override
    public void novaTemperatura(double temp) {
    }
    @Override
    public void novaPressao(double pressao) {
    }
    @Override
    public void novaPrecipitacao(double precip) {
        informarPrecipitacao(precip);
        calcularProbChuva();
    }
}
