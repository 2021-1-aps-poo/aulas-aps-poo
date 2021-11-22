package br.ufpb.dcx.rodrigor.aulas.observer.estacaoMeteor;

public interface EstacaoListener {

    public void novaTemperatura(double temp);
    public void novaPressao(double pressao);
    public void novaPrecipitacao(double precip);
}
