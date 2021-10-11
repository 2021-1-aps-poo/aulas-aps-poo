package br.ufpb.dcx.rodrigor.aulas.formbuilder;

public class ValidadorCampoEmail implements ValidadorCampo{

    @Override
    public boolean validar(String valor) {
        return valor.contains("@");
    }
}
