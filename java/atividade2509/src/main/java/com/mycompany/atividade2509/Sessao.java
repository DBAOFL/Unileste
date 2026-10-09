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
public class Sessao {
    private String horario;
    private String sala;
    private Filme filme;
    private ArrayList<Ingresso> ingressos = new ArrayList<>();
    
    public void setHorario (String horario) {
        if (horario != null && !horario.isBlank()) {
            this.horario = horario;
        }
    }
    public String getHorario () {
        return horario;
    }
    public void setSala (String sala) {
        if (sala != null && !sala.isBlank()) {
            this.sala = sala;
        }
    }
    public String getSala () {
        return sala;
    }
    public void definirFilme (Filme filme) {
        if (filme != null) {
            this.filme = filme;
        }
    }
    public void emitirIngresso (String codigo , double valor) {
        Ingresso ingresso = new Ingresso();
        ingresso.setCodigo(codigo);
        ingresso.setValor(valor);
        ingressos.add(ingresso);
    }
    public void listarSessao () {
        System.out.println("Sessão: " + horario + " | Sala: " + sala);
        if (filme != null) {
            filme.exibir();
        }
        for (Ingresso ingresso : ingressos) {
            ingresso.exibir();
        }
    }
    public double totalArrecadado () {
        double total = 0;
        for (Ingresso ingresso : ingressos) {
            total += ingresso.getValor();
        }
        return total;
    }
}
