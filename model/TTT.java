package model;

import java.util.Enumeration;

public class TTT {

    private int input;
    private boolean is_X;
    private int[] available = new int[25];
    private int[] X_Storage;
    private int[] O_Storage;
    private boolean winner = false;
    private enum state {
        Player1
    }

    void playGame() {
        for (int i = 0; i < 25; i++) {
            available[i] = i + 1;
        }
    }

    void setInput()

    static void checkWinner() {
        
    }

    static void check_availability(int x) {

    }
    
}
