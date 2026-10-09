/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Caixa {
    private int numero;
    private double saldo;
    
    public void setNumero (int numero) {
        if (numero >= 0) {
            this.numero = numero;
        }
    }
    public int getNumero () {
        return numero;
    }
    public void setSaldo (double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
    public double getSaldo () {
        return saldo;
    }
    public void exibir () {
        System.out.println("Caixa: " + numero + " | Saldo: " + saldo);
    }
}
