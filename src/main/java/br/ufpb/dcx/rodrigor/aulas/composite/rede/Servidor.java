package br.ufpb.dcx.rodrigor.aulas.composite.rede;

public class Servidor implements ElementoRede{

    private int status;

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public String getNome() {
        return "Servidor";
    }
}
