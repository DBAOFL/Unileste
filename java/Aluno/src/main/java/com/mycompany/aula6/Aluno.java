/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula6;

/**
 *
 * @author daniel.bassis
 */
public class Aluno {
    private String nome;
    private double nota;
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    
    public void setNota(double nota){
        if (0 <= nota && nota <= 10) {
            this.nota = nota;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void exibirBoletim() {
        System.out.println(
                "Nome: " + nome +
                "\nNota: " + nota +
                "\nBoletim: " + nome + " " + nota);
    }
}
