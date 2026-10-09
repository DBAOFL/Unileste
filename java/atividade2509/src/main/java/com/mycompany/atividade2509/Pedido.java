/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;
import java.util.ArrayList;

/**
 *
 * @author daniel.bassis
 */
public class Pedido {
    private int numero;
    private String cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<>();
    
    public void setNumero(int numero){
        if (numero > 0){
            this.numero = numero;
        }
    }
    public int getNumero(){
        return numero;
    }
    public void setCliente(String cliente){
        if (cliente != null && !cliente.isBlank()){
            this.cliente = cliente;
        }
    }
    public String getCliente(){
        return cliente;
    }
    public void adicionarItem(String descricao , int quantidade , double precoUnitario){
        if (quantidade > 0 && descricao != null && !descricao.isBlank()){
            ItemPedido item = new ItemPedido();
            item.setDescricao(descricao);
            item.setQuantidade(quantidade);
            item.setPrecoUnitario(precoUnitario);
            itens.add(item);
        }
    }
    public void listarItens(){
        for (ItemPedido item : itens) {
            System.out.println("Pedido: " + numero + "\nCliente: " + cliente 
                    + "\n===================\n");
            item.exibir();
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }
}