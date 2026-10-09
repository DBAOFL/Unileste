/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula6;

/**
 *
 * @author daniel.bassis
 */
public class Cofre {
    private String senha;
    private boolean aberto;
    
    public void setSenha(String senha){
        if (senha.length() >= 4) {
            this.senha = senha;
        }
    }
    
    public void abrir(String tentativa){
        if (tentativa.equals(senha)) {
            aberto = true;
        }
    }
    
    public void fechar(){
        aberto = false;
    }
    
    public boolean isAberto(){
        return aberto;
    }
    
    public void exibirEstado(){
        System.out.println("O cofre está aberto?: " + isAberto());
    }
}