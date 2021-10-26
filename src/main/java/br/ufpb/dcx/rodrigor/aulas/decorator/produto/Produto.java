package br.ufpb.dcx.rodrigor.aulas.decorator.produto;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;

    private CalculadorImposto calculador;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularImposto(){
        return this.calculador.calcularImposto(this.preco);
    }

    public void setCalculadorImposto(CalculadorImposto calculador){
        this.calculador = calculador;
    }


}
