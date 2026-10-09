/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Coracao {
    private int batimentos;
    
    public void setBatimentos(int batimentos){
        if (batimentos >= 0){
            this.batimentos = batimentos;
        }
    }
    public int getBatimentos(){
        return batimentos;
    }
    public void exibir(){
        System.out.println("Batimentos: " + batimentos);
    }
}
