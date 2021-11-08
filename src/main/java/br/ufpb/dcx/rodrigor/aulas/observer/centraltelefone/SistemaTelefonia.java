package br.ufpb.dcx.rodrigor.aulas.observer.centraltelefone;

public class SistemaTelefonia {

    public static void main(String[] args) {

        Telefone t1 = new Telefone("98111111");
        Telefone t2 = new Telefone("98112222");
        Fax fax = new Fax();

        CentralTelefonica central = new CentralTelefonica("Central 1");
        CentralTelefonica central2 = new CentralTelefonica("Central 2");

        central.addCentralTelefonicaListener(t1);
        central.addCentralTelefonicaListener(t2);
        central.addCentralTelefonicaListener(fax);

        central2.addCentralTelefonicaListener(t2);
        central2.addCentralTelefonicaListener(fax);


        central.chamadaVoz();
        central2.chamadaVoz();
    }
}
