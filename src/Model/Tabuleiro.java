/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicol
 */
public class Tabuleiro {

    private static final String[][] matriz = new String[3][3];

    public void joga(Posicao posicao, String simboloJogador) {
         
        if (posicaoLivre(posicao)) {
            matriz[posicao.getLinha()][posicao.getColuna()] = simboloJogador;
        }
    }

    private boolean posicaoLivre(Posicao posicao) {

        if (matriz[posicao.getLinha()][posicao.getColuna()].equals("")) {
            return true;
        }
        return false;
    }

    private List<Posicao> jogadasPossiveis(String[][] matriz) {

        List<Posicao> jogadasPossiveis = new ArrayList<>();

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (matriz[linha][coluna].equals("")) {
                    jogadasPossiveis.add(new Posicao(linha, coluna));
                }
            }
        }

        return jogadasPossiveis;
    }

    private String[][] copiaMatriz(String[][] matriz) {
        String[][] matrizTeste = new String[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matrizTeste[linha][coluna] = matriz[linha][coluna];
            }
        }

        return matrizTeste;
    }

    private String verificaGanhador(String[][] matriz) {

        for (int i = 0; i < 3; i++) {
            if (!matriz[i][0].isEmpty() && matriz[i][0].equals(matriz[i][1]) && matriz[i][1].equals(matriz[i][2])) {

                return matriz[i][0];
            }

            if (!matriz[0][i].isEmpty() && matriz[0][i].equals(matriz[1][i]) && matriz[1][i].equals(matriz[2][i])) {
                return matriz[0][i];
            }

        }

        if (!matriz[0][0].isEmpty() && matriz[0][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][2])) {
            return matriz[0][0];
        }

        if (!matriz[0][2].isEmpty() && matriz[0][2].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][0])) {
            return matriz[0][2];
        }

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                if (matriz[linha][coluna].isEmpty()) {
                    return "em andamento";
                }
            }   
        }

        return "empate";
    }
}
