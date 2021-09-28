package br.ufpb.dcx.rodrigor.aulas.controlevendas;

import br.ufpb.dcx.rodrigor.aulas.controlevendas.leitorCodigoBarras.LeitorC3Tech;

public class Caixa {

    private LeitorCodigoBarras leitorCodigo;


    public Caixa(){
        this.leitorCodigo = new LeitorC3Tech();

    }


    public LeitorCodigoBarras getLeitorCodigo(){
        return this.leitorCodigo;
    }

}
