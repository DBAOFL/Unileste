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
public class Album {
    private String titulo;
    private String artista;
    private ArrayList<Faixa> faixas = new ArrayList<>();
    
    public void setTitulo (String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        }
    }
    public String getTitulos () {
        return titulo;
    }
    public void setArtista (String artista) {
        if (artista != null && !artista.isBlank()) {
            this.artista = artista;
        }
    }
    public String getArtista () {
        return artista;
    }
    public void adicionarFaixa (String titulo, int duracaoSegundos) {
        Faixa faixa = new Faixa(); 
        faixa.setTitulo(titulo); 
        faixa.setDuracaoSegundos(duracaoSegundos);
        faixas.add(faixa);
    }
    public void listarFaixas () {
        System.out.println("Álbum: " + titulo + "\nArtista: " + artista);
        for (Faixa faixa : faixas) {
            faixa.exibir();
        }
    }
}
