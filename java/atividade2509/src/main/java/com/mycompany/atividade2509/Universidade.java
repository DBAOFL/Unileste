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
public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos = new ArrayList<>();
    
    public void setNome (String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    public String getNome () {
        return nome;
    }
    public void criarDepartamento(String nome, String sigla){
        if (nome != null && !nome.isBlank() && sigla != null && !sigla.isBlank()) {
            Departamento departamento = new Departamento();
            departamento.setNome(nome);
            departamento.setSigla(sigla);
            departamentos.add(departamento);
        }
    }
    public void adicionarProfessorNoDepartamento (String sigla, Professor professor) {
        if (professor != null && sigla != null && !sigla.isBlank()) {
                for (int i = 0; i < departamentos.size(); i++) {
                    if (departamentos.get(i).getSigla().equals(sigla)) {
                        departamentos.get(i).adicionarProfessor(professor);
                };
            }
        }   
    }
    public void listarUniversidade(){
        System.out.println("Universidade: " + nome);
        for (Departamento departamento : departamentos) {
            departamento.listarProfessores();
        }
    }
}