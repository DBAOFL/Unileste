/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2509;
import java.util.ArrayList;

/**
 *
 * @author daniel.bassis
 */
public class Time {

    private String nome;
    private String cidade;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setCidade(String cidade){
        if (cidade != null && !cidade.isBlank()){
            this.cidade = cidade;
        }
    }
    public String getCidade(){
        return cidade;
    }
    public void adicionarJogador(Jogador jogador){
        if (jogador != null){
            jogadores.add(jogador);
        }
    }
    public void listarJogadores(){
        System.out.println("Time: " + nome +
                "\nCidade: " + cidade + 
                "\n====================");
        for (Jogador jogador : jogadores) {
            jogador.exibir();
            System.out.println("\n");
        }
    }
}
