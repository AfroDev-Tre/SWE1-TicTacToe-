package model;

import java.util.Enumeration;
import java.util.Vector;

public class TTT {

    private boolean is_X;
    private int it = 1;
    private Vector<Integer> available = new Vector<Integer>();
    private Vector<Integer> X_Storage = new Vector<Integer>();
    private Vector<Integer> O_Storage = new Vector<Integer>();
    private boolean winner = false;

    private enum Player {
        Player1, Player2
    }
    private Player player = Player.Player1;

    void playGame() {
        for (int i = 0; i < 25; i++) {
            available.add(i + 1);
        }
    }

    void setInput(Player player, int x) {
        if (get_IsX() == true) {
            getX_Storage().add(x);
        } else {
            getO_Storage().add(x);
        }

        available.remove(x - getIt());
        setIt(it);
    }

    static void checkWinner(Player player) {
        
    }

    /*public int switchTest() {
        
        switch(a) {
        case 0:
            
        }
    }*/

    void setPlayer(Player p) {
        this.player = p;
    }
    
    public Player getPlayer() {
        return player;
    }

    public boolean get_IsX() {
        return is_X;
    }

    public Vector<Integer> getO_Storage() {
        return O_Storage;
    }

    public Vector<Integer> getX_Storage() {
        return X_Storage;
    }

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it++;
    }
}
