    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nicol
 */

public class Jogo {
    private static int contadorJogada = 0;
    private static final Tabuleiro tabuleiro = new Tabuleiro();
    
    private void turnoJogador(Posicao posicao, String modoJogo) {
        String simboloJogador = "";

        if (modoJogo.equals("pvp")) {
            if (contadorJogada % 2 == 0) {
                simboloJogador = "X";
            }

            if (contadorJogada % 2 != 0) {
                simboloJogador = "O";
            }
            
        } else {
            simboloJogador = "X";
        }

        contadorJogada++;
        
        tabuleiro.joga(posicao, simboloJogador);
    }
    
    
}
