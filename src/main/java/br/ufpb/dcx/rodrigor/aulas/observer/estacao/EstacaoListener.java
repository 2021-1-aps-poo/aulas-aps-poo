package br.ufpb.dcx.rodrigor.aulas.observer.estacao;

public interface EstacaoListener {


    void novaTemperatura(EstacaoEvent event);

    void novaPressao(EstacaoEvent event);

    void novaPrecipitacao(EstacaoEvent event);

    void novaMedidaVento(EstacaoEvent event);

    void novaMedidaRaioUV(EstacaoEvent event);
}
