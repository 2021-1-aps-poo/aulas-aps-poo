package br.ufpb.dcx.rodrigor.aulas.decorator.formbuilder;

public class FormBuilder {

    public static void main(String[] args) {
        Formulario form = new Formulario("Form APS");

        Campo nome = new Campo("nome","Digite seu nome",new ValidadorCampoTexto(200));
        Campo email = new Campo("email","Digite seu Email", new ValidadorCampoEmail());
        Campo idade = new Campo("idade", "Digite sua Idade:", new ValidadorCampoNumerico(1,130));

        form.add(nome);
        form.add(email);
        form.add(idade);

        form.getCampo("nome").setValor("Rodrigo");
        form.getCampo("email").setValor("rodrigor@dcx.ufpb,br");

        form.getCampo("idade").setValor("41");

        form.getCampo("idade").validar();

        if(!form.getCampo("nome").validar()){
            System.out.println("Valor inválido para o campo Nome!!");
        };

    }
}
