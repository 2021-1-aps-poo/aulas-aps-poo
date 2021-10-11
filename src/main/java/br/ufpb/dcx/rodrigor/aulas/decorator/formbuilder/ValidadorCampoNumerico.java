package br.ufpb.dcx.rodrigor.aulas.decorator.formbuilder;


public class ValidadorCampoNumerico implements ValidadorCampo {

    private int min_valor;
    private int max_valor;

    public ValidadorCampoNumerico(int min_valor, int max_valor) {
        this.min_valor = min_valor;
        this.max_valor = max_valor;
    }

    @Override
    public boolean validar(String valor) {
        try {
            int v = Integer.parseInt(valor);
            if(v < min_valor || v > max_valor) return false;
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
