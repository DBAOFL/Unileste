/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    
    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isBlank()){
            this.titulo = titulo;
        }
    }    
    public String getTitulo(){
        return titulo;
    }
    public void setArtista(String artista){
        if (artista != null && !artista.isBlank()){
            this.artista = artista;
        }
    }
    public String artista(){
        return artista;
    }
    public void setDuracaoSegundos(int duracaoSegundos){
        if (duracaoSegundos > 0) {
            this.duracaoSegundos = duracaoSegundos;
        }
    }
    public int getDuracaoSegundos(){
        return duracaoSegundos;
    }
    public void exibir(){
        System.out.println("Musica: " + titulo +
                "\nArtista: " + artista +
                "\nDuracao: " + duracaoSegundos + " segundos");
    }
}
