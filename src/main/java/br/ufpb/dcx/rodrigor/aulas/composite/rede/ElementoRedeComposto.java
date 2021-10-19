package br.ufpb.dcx.rodrigor.aulas.composite.rede;

import java.util.LinkedList;
import java.util.List;

public abstract class ElementoRedeComposto implements ElementoRede{

    private List<ElementoRede> componentes = new LinkedList<>();

    public void addComponente(ElementoRede componente){
        this.componentes.add(componente);
    }

    @Override
    public int getStatus() {
        int status = VERDE;
        for(ElementoRede elemento: componentes){
            if(elemento.getStatus() > status)
                status = elemento.getStatus();
        }
        return status;
    }

    @Override
    public abstract String getNome();
}
