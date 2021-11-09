package br.ufpb.dcx.rodrigor.aulas.strategy.formbuilder;

public class Campo {

    private String id;
    private String titulo;
    private String valor;
    private ValidadorCampo validador;

    public Campo(String id, String titulo, ValidadorCampo validador) {
        this.id = id;
        this.titulo = titulo;
        this.validador = validador;
    }

    public boolean validar() {
        return validador.validar(this.valor);
    }


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
