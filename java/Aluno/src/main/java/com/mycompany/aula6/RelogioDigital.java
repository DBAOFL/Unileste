/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula6;

/**
 *
 * @author daniel.bassis
 */
public class RelogioDigital {
    private int hora;
    private int minuto;
    
    public void setHora(int hora){
        if (0 <= hora && hora <= 23) {
            this.hora = hora;
        }
    }
    
    public void setMinuto(int minuto){
        if (0 <= minuto && minuto <= 59) {
            this.minuto = minuto;
        }
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public void avancarMinuto(){
        if (minuto < 59) {
            minuto += 1;
        } else {
            minuto = 0;
            if (hora < 23) {
                hora += 1;
            } else {
                hora = 0;
            }
        }
    }
    
    public void exibir(){
        System.out.println("Agora são " + hora + ":" + minuto);
    }
}
