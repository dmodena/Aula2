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
public class Controle {
    private boolean ligado;
    private int canal;
    private int volume;
    
    public Controle(boolean ligado) {
        this.ligado = ligado;
    }
    
    public Controle(boolean ligado, int canal) {
        this.ligado = ligado;
        this.canal = canal;
    }
    
    public Controle(boolean ligado, int canal, int volume) {
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
    }
    
    public boolean getLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public int getCanal() {
        return canal;
    }
    
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
} 
