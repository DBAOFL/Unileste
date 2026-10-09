/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Ingresso {
    private String codigo;
    private double valor;
    
    public void setCodigo (String codigo) {
        
    }
    public String getString () {
        return codigo;
    }
    public void setValor(double valor){
        if (valor >= 0) {
            this.valor = valor;
        }
    }
    public double getValor () {
        return valor;
    }
    public void exibir () {
        System.out.println("Ingresso: " + codigo + " | Valor: " + valor);
    }
}
