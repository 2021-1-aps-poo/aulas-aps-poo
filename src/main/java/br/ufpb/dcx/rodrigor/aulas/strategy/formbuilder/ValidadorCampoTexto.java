package br.ufpb.dcx.rodrigor.aulas.strategy.formbuilder;

public class ValidadorCampoTexto implements ValidadorCampo{

    private int tam_max;

    public ValidadorCampoTexto(int max){
        this.tam_max = max;
    }


    @Override
    public boolean validar(String valor) {
        return valor.length() <= tam_max;
    }
}
