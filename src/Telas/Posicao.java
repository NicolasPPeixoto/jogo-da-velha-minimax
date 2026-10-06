/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telas;

/**
 *
 * @author nicol
 */
public class Posicao {
    private int linha;
    private int coluna;
    
    public Posicao(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    
    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
