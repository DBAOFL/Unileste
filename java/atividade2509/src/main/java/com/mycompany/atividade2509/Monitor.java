/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Monitor {
    private String nome;
    private String matricula;
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(String matricula){
        if (matricula != null && !matricula.isBlank()){
            this.matricula = matricula;
        }
    }
    public String getMatricula(){
        return matricula;
    }
    public void exibir(){
        System.out.println("Monitor: " + nome + "\nMatricula: " + matricula);
    };
}
