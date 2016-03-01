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
public class Impressora {
    private String texto;
    private String continuacao;
    private boolean impressaoOk;
    private int codigoImpressao;
    private int paginaInicial;
    private int paginaFinal;
    private int quantidadePaginas;
    private int[] codigoPaginas;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getContinuacao() {
        return continuacao;
    }

    public void setContinuacao(String continuacao) {
        this.continuacao = continuacao;
    }

    public boolean isImpressaoOk() {
        return impressaoOk;
    }

    public void setImpressaoOk(boolean impressaoOk) {
        this.impressaoOk = impressaoOk;
    }

    public int getCodigoImpressao() {
        return codigoImpressao;
    }

    public void setCodigoImpressao(int codigoImpressao) {
        this.codigoImpressao = codigoImpressao;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public int[] getCodigoPaginas() {
        return codigoPaginas;
    }

    public void setCodigoPaginas(int[] codigoPaginas) {
        this.codigoPaginas = codigoPaginas;
    }
            
    public boolean imprimir(String texto) {
        impressaoOk = !texto.isEmpty();
        
        return impressaoOk;
    }
    
    public int imprimir(String texto, int paginaInicial, int paginaFinal) {
        if(paginaInicial < 10) {
            codigoImpressao = 0;
        }
        else if(paginaInicial < 20) {
            codigoImpressao = 1;
        }
        else if(paginaInicial < 30) {
            codigoImpressao = 2;
        }
        else if(paginaInicial < 40) {
            codigoImpressao = 3;
        }
        else if(paginaInicial < 50) {
            codigoImpressao = 4;
        }
        else if(paginaInicial < 60) {
            codigoImpressao = 5;
        }
        else {
            codigoImpressao = 6;
        }
        
        return codigoImpressao;
    }
    
    public int[] imprimir(String texto, String continuacao, int quantidadePaginas) {
        if(texto.length() > continuacao.length()) {
            codigoPaginas = new int[3];
            codigoPaginas[0] = 0;
            codigoPaginas[1] = 1;
            codigoPaginas[2] = 2;
        }
        else if(texto.length() == continuacao.length()) {
            codigoPaginas = new int[3];
            codigoPaginas[0] = 2;
            codigoPaginas[1] = 1;
            codigoPaginas[2] = 0;
        }
        else {
            codigoPaginas = new int[3];
            codigoPaginas[0] = 0;
            codigoPaginas[1] = 0;
            codigoPaginas[2] = 0;
        }
        
        return codigoPaginas;
    }
}
