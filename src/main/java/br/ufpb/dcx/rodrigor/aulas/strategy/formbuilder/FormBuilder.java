package br.ufpb.dcx.rodrigor.aulas.strategy.formbuilder;

public class FormBuilder {

    public static void main(String[] args) {
        Formulario form = new Formulario("Form POO");

        Campo nome = new Campo("nome","Digite seu nome",new ValidadorCampoTexto(200));
        Campo email = new Campo("email","Digite seu Email", new ValidadorCampoEmail());

        form.add(nome);
        form.add(email);

        form.getCampo("nome").setValor("Rodrigo");
        form.getCampo("email").setValor("rodrigor@dcx.ufpb,br");

        if(!form.getCampo("nome").validar()){
            System.out.println("Valor inválido para o campo Nome!!");
        };

    }
}
