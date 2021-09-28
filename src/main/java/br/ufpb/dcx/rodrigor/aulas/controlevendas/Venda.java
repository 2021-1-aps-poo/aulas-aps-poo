package br.ufpb.dcx.rodrigor.aulas.controlevendas;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Venda {

    private Calendar dataHora;

    private List<ItemPedido> itens = new LinkedList<>();


    public void addProduto(Produto produto, int quantidade){
        String codigo =
        this.itens.add(new ItemPedido(produto,quantidade));
    }

}
