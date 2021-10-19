package br.ufpb.dcx.rodrigor.aulas.composite.rede;

public class ExemploRede {

    public static void main(String[] args) {


        Roteador roteador = new Roteador();

        Notebook notebook = new Notebook();
        Servidor server = new Servidor();
        notebook.setStatus(ElementoRede.VERMELHO);

        roteador.addComponente(notebook);
        roteador.addComponente(server);

        System.out.println("Status Roteador: "+roteador.getStatus());

    }
}
