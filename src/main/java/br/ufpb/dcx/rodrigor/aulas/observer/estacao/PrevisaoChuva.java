package br.ufpb.dcx.rodrigor.aulas.observer.estacao;

import java.util.LinkedList;
import java.util.List;

public class PrevisaoChuva extends EstacaoListenerAdapter{

    private List<Float> histTemperatura, histPressao, histPrec = new LinkedList<>();

    @Override
    public void novaTemperatura(EstacaoEvent event) {
        histTemperatura.add(event.getTemperatura());
    }

    @Override
    public void novaPressao(EstacaoEvent event) {
        histPressao.add(event.getPressao());
    }

    @Override
    public void novaPrecipitacao(EstacaoEvent event) {
        histPrec.add(event.getPrecipitacao());
    }

    @Override
    public void novaMedidaVento(EstacaoEvent event) {
        // blah...
    }

}
