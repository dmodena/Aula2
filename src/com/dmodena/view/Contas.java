/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Calculadora;

/**
 *
 * @author dmodena
 */
public class Contas {
    public static void main(String[] args) {
        final int QTD = 8;
        Integer[] inteiros = new Integer[QTD];
        Float[] flutuantes = new Float[QTD];
        Double[] duplos = new Double[QTD];
        
        for(int i = 0; i < QTD; i++) {
            inteiros[i] = 100 + (int) (Math.random() * 899);
            flutuantes[i] = 100.0f + (float) (Math.random() * 899);
            duplos[i] = 100.0d + (double) (Math.random() * 899);
        }
        
        // Calculando valores int
        int somaInt = Calculadora.adicionar(inteiros[0], inteiros[1]);
        int subtInt = Calculadora.subtrair(inteiros[2], inteiros[3]);
        int multInt = Calculadora.multiplicar(inteiros[4], inteiros[5]);
        int diviInt = Calculadora.dividir(inteiros[6], inteiros[7]);
        
        // Calculando valores float
        float somaFloat = Calculadora.adicionar(flutuantes[0], flutuantes[1]);
        float subtFloat = Calculadora.subtrair(flutuantes[2], flutuantes[3]);
        float multFloat = Calculadora.multiplicar(flutuantes[4], flutuantes[5]);
        float diviFloat = Calculadora.dividir(flutuantes[6], flutuantes[7]);
        
        // Calculando valores double
        double somaDouble = Calculadora.adicionar(duplos[0], duplos[1]);
        double subtDouble = Calculadora.subtrair(duplos[2], duplos[3]);
        double multDouble = Calculadora.multiplicar(duplos[4], duplos[5]);
        double diviDouble = Calculadora.dividir(duplos[6], duplos[7]);
        
        // Exibindo resultados
        System.out.println("Operacoes com inteiros");
        System.out.println("------------------------------");
        System.out.println("Soma: " + inteiros[0] + " + " + inteiros[1] + " = " + somaInt);
        System.out.println("Subtracao: " + inteiros[2] + " - " + inteiros[3] + " = " + subtInt);
        System.out.println("Multiplicacao: " + inteiros[4] + " * " + inteiros[5] + " = " + multInt);
        System.out.println("Divisao: " + inteiros[6] + " / " + inteiros[7] + " = " + diviInt);
        System.out.println();
        System.out.println("Operacoes com pontos flutuantes");
        System.out.println("------------------------------");
        System.out.println("Soma: " + flutuantes[0] + " + " + flutuantes[1] + " = " + somaFloat);
        System.out.println("Subtracao: " + flutuantes[2] + " - " + flutuantes[3] + " = " + subtFloat);
        System.out.println("Multiplicacao: " + flutuantes[4] + " * " + flutuantes[5] + " = " + multFloat);
        System.out.println("Divisao: " + flutuantes[6] + " / " + flutuantes[7] + " = " + diviFloat);
        System.out.println();
        System.out.println("Operacoes com duplos");
        System.out.println("------------------------------");
        System.out.println("Soma: " + duplos[0] + " + " + duplos[1] + " = " + somaDouble);
        System.out.println("Subtracao: " + duplos[2] + " - " + duplos[3] + " = " + subtDouble);
        System.out.println("Multiplicacao: " + duplos[4] + " * " + duplos[5] + " = " + multDouble);
        System.out.println("Divisao: " + duplos[6] + " / " + duplos[7] + " = " + diviDouble);        
    }
}
