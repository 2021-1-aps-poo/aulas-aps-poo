package br.ufpb.dcx.rodrigor.aulas.observer.produto;

import java.util.LinkedList;
import java.util.List;

public class Produto {

    private String nome, descricao;
    private double valor;
    private int estoque;
    private int estoque_min, estoque_max;

    private List<ProdutoListener> listeners = new LinkedList<>();

    public Produto(String nome, int min, int max){
        this.nome = nome;
        this.estoque_min = min;
        this.estoque_max = max;
    }

    public Produto(String nome){
        this(nome, 0, 1000);
    }

    public void acrescentarEstoque(int quant){
        this.estoque += quant;
        verificarEstoque();
    }

    public void retirarEstoque(int quant){
        if((this.estoque - quant) < 0)
            throw new RuntimeException("Estoque insuficiente. Estoque: "+this.estoque+", quant:"+quant);
        this.estoque -= quant;
        verificarEstoque();
    }

    public void verificarEstoque(){
        if(this.estoque <= estoque_min) {
            dispararEstoqueBaixo();
        }else
            if(this.estoque >= estoque_max) {
                dispararEstoqueAlto();
            }
    }

    private void dispararEstoqueBaixo() {
        for(ProdutoListener listener: listeners) {
            listener.estoqueBaixo(new ProdutoEvent(this));
        }
    }

    private void dispararEstoqueAlto(){
        for(ProdutoListener listener: listeners) {
            listener.estoqueAlto(new ProdutoEvent(this));
        }
    }

    public void addListener(ProdutoListener listener){
        this.listeners.add(listener);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", estoque=" + estoque +
                ", estoque_min=" + estoque_min +
                ", estoque_max=" + estoque_max +
                '}';
    }
}
