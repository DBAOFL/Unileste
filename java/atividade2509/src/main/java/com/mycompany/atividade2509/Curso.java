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
public class Curso {
    private String nome;
    private String codigo;
    private ArrayList<Monitor> monitores = new ArrayList<>();
    
    public void setNome(String nome){
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setCodigo(String codigo){
        if (codigo != null && !codigo.isBlank()){
            this.codigo = codigo;
        }
    }
    public String getCodigo(){
        return codigo;
    }
    public void adicionarMonitor(Monitor monitor){
        if (monitor != null) {
            monitores.add(monitor);
        }
    }
    public void removerMonitor(Monitor monitor){
        if (monitor != null && monitores.contains(monitor)) {
            monitores.remove(monitor);
        }
    }
    public void listarMonitores(){
        System.out.println("Curso: " + nome + "\nCodigo: " + codigo + "\n===============");
        for (Monitor monitor : monitores) {
            monitor.exibir();
            System.out.println("\n");
        }
    }
}
