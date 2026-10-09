/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Filme {
    private String titulo;
    private int duracaoMinutos;
    
    public void setTitulo (String titulo) {
        
    }
    public String getTitulo () {
        return titulo;
    }
    public void setDuracaoMinutos (int duracaoMinutos) {
        if (duracaoMinutos > 0) {
            this.duracaoMinutos = duracaoMinutos;
        }
    }
    public int getDuracaoMinutos () {
        return duracaoMinutos;
    }
    public void exibir() {
        System.out.println("Filme: " + titulo + " | Duração: " + duracaoMinutos);
    }
}
