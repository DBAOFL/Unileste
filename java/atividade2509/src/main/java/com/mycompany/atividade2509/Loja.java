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
public class Loja {
    private String nome;
    private Caixa caixa;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public void setNome (String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    public String getNome () {
        return nome;
    }
    public void abrirCaixa (int numero , double saldo) {
        Caixa caixa = new Caixa(); 
        caixa.setNumero(numero); 
        caixa.setSaldo(saldo); 
        this.caixa = caixa;
    }
    public void adicionarProduto (Produto produto) {
        produtos.add(produto);
    }
    public void listarLoja () {
        System.out.println("Loja: " + nome);
        if (caixa != null) {
            caixa.exibir();
        }
        for (Produto produto : produtos) {
            produto.exibir();
        }
    }
}
