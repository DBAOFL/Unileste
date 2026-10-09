/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula6;

/**
 *
 * @author daniel.bassis
 */
public class Retangulo {
    private double largura;
    private double altura;
    
    public void setLargura(double largura){
        if (largura > 0){
            this.largura = largura;
        }
    }
        
    public void setAltura(double altura){
        if (altura > 0){
            this.altura = altura;
        }
    }
    
    public double calcularArea(){
        return altura*largura;
    }
    
    public double calcularPerimetro(){
        return 2*(altura+largura);
    }
    
    public void exibir(){
        System.out.println(
                "Altura: " + altura + 
                "\nLargura: " + largura +
                "\nÁrea: " + calcularArea() +
                "\nPerímetro: " + calcularPerimetro());
    }
}
