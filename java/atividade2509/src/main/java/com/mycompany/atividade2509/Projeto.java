/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2509;

/**
 *
 * @author daniel.bassis
 */
public class Projeto {
    private String nome;
    private double orcamento;
    private Gerente gerente;
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setOrcamento(double orcamento){
        if (orcamento > 0){
            this.orcamento = orcamento;
        }
    }
    public void definirGerente(Gerente gerente){
        if (this.gerente == null && gerente != null) {
            this.gerente = gerente;
        }
    }
    public void exibirProjeto(){
        System.out.println("Projeto: " + nome +
                "\nOrcamento: " + orcamento);
        String temGerente = (gerente != null) ? String.format("\nGerente: \n%s", gerente.exibir()) : "\nGerente: Sem gerente";
        System.out.println(temGerente);
    };
}
