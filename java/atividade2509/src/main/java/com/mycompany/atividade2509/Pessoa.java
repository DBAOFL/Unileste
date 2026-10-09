/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Pessoa {
    private String nome;
    private int idade;
    private Coracao coracao;
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        if (idade > 0){
            this.idade=idade;
        }
    }
    public int getIdade(){
        return idade;
    }
    public void criarCoracao(int batimentos){
        Coracao coracao = new Coracao();
        coracao.setBatimentos(batimentos);
        this.coracao = coracao;
    }
    public void exibirPessoa(){
        System.out.println( "Pessoa: " + nome + "\nIdade: " + idade);
        if (coracao != null) {
            coracao.exibir();
        }
    }
}