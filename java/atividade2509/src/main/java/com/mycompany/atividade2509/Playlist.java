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
public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas = new ArrayList<>();
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void adicionarMusica(Musica musica){
        if (musica != null) { 
            musicas.add(musica);
        }
    }
    public void listarMusicas(){
        System.out.println("Playlist: " + nome +
                "\n===================");
        for (Musica musica : musicas) {
            musica.exibir();
            System.out.println("\n");
        }
    }
}
