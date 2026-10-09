/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula6;

/**
 *
 * @author daniel.bassis
 */
public class Elevador {
    private int andarMaximo;
    private int andarAtual;
    
    public void setAndarMaximo(int andarMaximo){
        if (andarMaximo > 0){
            this.andarMaximo = andarMaximo;
        }
    }
    
    public int getAndarMaximo(){
        return andarMaximo;
    }
    
    public int getAndarAtual(){
        return andarAtual;
    }
    
    public void subir(){
        if (andarAtual < andarMaximo) {
            andarAtual += 1;
        }
    }
    
    public void descer(){
        if ((andarAtual - 1) >= 0) {
            andarAtual -= 1;
        }
    }
    
    public void exibirAndar(){
        System.out.println("Andar atual: "+getAndarAtual());
    }
}
