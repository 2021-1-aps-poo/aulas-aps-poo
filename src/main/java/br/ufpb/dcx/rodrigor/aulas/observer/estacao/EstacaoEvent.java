package br.ufpb.dcx.rodrigor.aulas.observer.estacao;

public class EstacaoEvent {

    private float temperatura;
    private float pressao;
    private float precipitacao;
    private float raioUV;
    private EstacaoMeteorologica source;

    public EstacaoEvent(EstacaoMeteorologica estacaoMeteorologica) {
        this.source = estacaoMeteorologica;
    }

    public EstacaoMeteorologica getSource() {
        return source;
    }

    public void setSource(EstacaoMeteorologica source) {
        this.source = source;
    }

    public float getRaioUV() {
        return raioUV;
    }

    public float getVelVento() {
        return velVento;
    }

    private float velVento;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPressao() {
        return pressao;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    public float getPrecipitacao() {
        return precipitacao;
    }

    public void setPrecipitacao(float precipitacao) {
        this.precipitacao = precipitacao;
    }

    public void setRaioUV(float raioUV) {
        this.raioUV = raioUV;
    }

    public void setVelVento(float velVento) {
        this.velVento = velVento;
    }
}
