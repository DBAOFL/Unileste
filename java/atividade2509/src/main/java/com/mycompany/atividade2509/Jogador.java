/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Jogador {
    private String nome;
    private String posicao;
    private int numero;
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setPosicao(String posicao){
        if (posicao != null && !posicao.isBlank()){
            this.posicao = posicao;
        }
    }
    public String getPosicao(){
        return posicao;
    }
    public void setNumero(int numero){
        if (numero >= 0){
            this.numero = numero;
        }
    }
    public void exibir(){
        System.out.println("Nome: " + nome + "\nPosicao: " + posicao + "\nNumero: " + numero);
    }
}