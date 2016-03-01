/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

/**
 *
 * @author dmodena
 */
public class Cliente {
    private String nome;
    private String fone;
    private double credito;
    
    public Cliente() {
        this.nome = "Nameless";
        this.fone = "123-4567";
        this.credito = 50.00;
    }
    
    public Cliente(String nome) {
        this.nome = nome;
        this.fone = "368-4527";
        this.credito = 100.00;
    }
    
    public Cliente(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
        this.credito = 150.00;
    }
    
    public Cliente(String nome, String fone, double credito) {
        this.nome = nome;
        this.fone = fone;
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }    
    
    public double getCreditoDisponivel() {
        double creditoDisponivel;
        
        if(credito > 0) {
            creditoDisponivel = credito;
        }
        else {
            creditoDisponivel = 0;
        }
        
        return creditoDisponivel;
    }
    
    public String toString() {
        return (nome + "\t - credito: R$" + getCreditoDisponivel());
    }
}
