/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Gerente {
    private String nome;
    private String email;
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setEmail(String email){
        if (email != null && !email.isBlank()){
            this.email = email;
        }
    }
    public String getEmail(){
        return email;
    }
    public String exibir(){
        return "Nome: " + nome + "\nEmail: " + email;
    };
}