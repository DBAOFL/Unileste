/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Professor {
    private String nome;
    private String titulacao;
    
    public void setNome (String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    public String getNome () {
        return nome;
    }
    public void setTitulacao (String titulacao) {
        if (titulacao != null && !titulacao.isBlank()) {
            this.titulacao = titulacao;
        }
    }
    public String getTitulacao () {
        return titulacao;
    }
    public void exibir(){
        System.out.println("Professor: " + nome + "| Titulação: " + titulacao);
    }
}
