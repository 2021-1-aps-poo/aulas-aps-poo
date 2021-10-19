package br.ufpb.dcx.rodrigor.aulas.composite.rede;

public class Notebook implements ElementoRede{

    public void setStatus(int status) {
        this.status = status;
    }

    private int status;

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public String getNome() {
        return "Notebook";
    }
}
