package application;

import chess.ChessPiece;

/**
 * Classe responsável pela interface do usuário do jogo de xadrez.
 * Contém métodos para impressão do tabuleiro e peças no console.
 */
public class UI {
    
    /**
     * Imprime o tabuleiro de xadrez completo no console.
     * Exibe as linhas numeradas de 8 a 1 (padrão do xadrez) e
     * todas as peças em suas respectivas posições.
     * 
     * @param pieces matriz de peças de xadrez representando o tabuleiro
     */
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    /**
     * Imprime uma peça individual no console.
     * Se a posição estiver vazia (piece == null), imprime um traço (-).
     * Caso contrário, imprime a representação da peça.
     * 
     * @param piece a peça de xadrez a ser impressa, ou null se a posição estiver vazia
     */
    private static void printPiece(ChessPiece piece){
        if (piece == null){
            System.out.print("-");
        } else {
            System.out.println(piece);
        }
        System.out.print(" ");
    }

}
