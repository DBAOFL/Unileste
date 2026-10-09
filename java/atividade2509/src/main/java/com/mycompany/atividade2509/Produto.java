/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Produto {
    private String nome;
    private double preco;
    
    public void setNome (String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    public String getNome () {
        return nome;
    }
    public void setPreco (double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }
    public double getPreco () {
        return preco;
    }
    public void exibir () {
        System.out.println("Produto: " + nome + " | Preço: " + preco);
    }
}
