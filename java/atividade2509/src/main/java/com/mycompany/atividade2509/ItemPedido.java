/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class ItemPedido {
    private String descricao;
    private int quantidade;
    private double precoUnitario;
    
    public void setDescricao(String descricao){
        if (descricao != null && !descricao.isBlank()) {
            this.descricao = descricao;
        }
    }
    public String getDescricao(){
        return descricao;
    }
    public void setQuantidade(int quantidade){
        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
    }
    public int getCliente(){
        return quantidade;
    }
    public void setPrecoUnitario(double precoUnitario){
        if (precoUnitario >= 0) {
            this.precoUnitario = precoUnitario;
        }
    }
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    public double subtotal(){
        return quantidade * precoUnitario;
    }
    public void exibir(){
        System.out.println( "Item: " + descricao + "\nQuantidade: " + quantidade + 
                "\nPreço: " + precoUnitario + "\nSubtotal: " + subtotal());
    }
}
