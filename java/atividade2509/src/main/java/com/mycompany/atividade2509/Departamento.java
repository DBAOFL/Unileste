/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;
import java.util.ArrayList;

/**
 *
 * @author daniel.bassis
 */
public class Departamento {
    private String nome;
    private String sigla;
    private ArrayList<Professor> professores = new ArrayList<>();
    
    public void setNome (String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    public String getNome () {
        return nome;
    }
    public void setSigla (String sigla) {
        if (sigla != null && !sigla.isBlank()) {
            this.sigla = sigla;
        }
    }
    public String getSigla () {
        return sigla;
    }
    public void adicionarProfessor (Professor professor) {
        professores.add(professor);
    }
    public void listarProfessores(){
        System.out.println("Departamento: " + nome + " | Sigla: " + sigla);
        
        for (Professor professor : professores){
            professor.exibir();
        }
    }
}
