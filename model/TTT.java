package model;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public class TTT {

    private static Vector<String> X_Storage = new Vector<String>();
    private static Vector<String> O_Storage = new Vector<String>();
    private boolean is_X;
    private int AI_Choice;
    Random random = new Random();
    private static boolean winner = false;

    private enum Player {
        Choose, Human, AI, AI2, Draw;
        private String assignment;
        /******************************** May Need Setter & Getter ********************************/
    }
    private Player player;

    void playGame() {
        for (int i = 0; i < 25; i++) {
            X_Storage.add(null);
        }
        for (int i = 0; i < 25; i++) {
            O_Storage.add(null);
        }
        player.Human.assignment = null;
        player.AI.assignment = null;
        player.AI2.assignment = null;
    }

    void setInput(Player player, int x) {
        if (player == Player.Human  && player.Human.assignment == "X") {
            getX_Storage().set(x - 1, "X");
        } else if (player == Player.Human && player.Human.assignment == "O") {
            getO_Storage().set(x - 1, "O");
        } else if (player == Player.AI && player.AI.assignment == "X") {
            getX_Storage().set(AI_Selection(), "X");
        } else if (player == Player.AI && player.AI.assignment == "O") {
            getO_Storage().set(AI_Selection(), "O");
        } else if (player == Player.AI2 && player.AI2.assignment == "X") {
            getX_Storage().set(AI_Selection(), "X");
        } else if (player == Player.AI2 && player.AI2.assignment == "X") {
            getO_Storage().set(AI_Selection(), "O");
        }
    }

    int AI_Selection() {
        AI_Choice = random.nextInt(25);
        return AI_Choice;
    }

    static void checkWinner(Player player) {
        String line = null;

        if (player.assignment == "X") {
            for (int a = 0; a < 12; a++) {
                switch(a) {
                    case 0:
                        line = getX_Storage().get(0) + getX_Storage().get(1) + getX_Storage().get(2) + getX_Storage().get(3) + getX_Storage().get(4);
                        break;
                    case 1:
                        line = getX_Storage().get(5) + getX_Storage().get(6) + getX_Storage().get(7) + getX_Storage().get(8) + getX_Storage().get(9);
                        break;
                    case 2:
                        line = getX_Storage().get(10) + getX_Storage().get(11) + getX_Storage().get(12) + getX_Storage().get(13) + getX_Storage().get(14);
                        break;
                    case 3:
                        line = getX_Storage().get(15) + getX_Storage().get(16) + getX_Storage().get(17) + getX_Storage().get(18) + getX_Storage().get(19);
                        break;
                    case 4:
                        line = getX_Storage().get(20) + getX_Storage().get(21) + getX_Storage().get(22) + getX_Storage().get(23) + getX_Storage().get(24);
                        break;
                    case 5:
                        line = getX_Storage().get(0) + getX_Storage().get(5) + getX_Storage().get(10) + getX_Storage().get(15) + getX_Storage().get(20);
                        break;
                    case 6:
                        line = getX_Storage().get(1) + getX_Storage().get(6) + getX_Storage().get(11) + getX_Storage().get(16) + getX_Storage().get(21);
                        break;
                    case 7:
                        line = getX_Storage().get(2) + getX_Storage().get(7) + getX_Storage().get(12) + getX_Storage().get(17) + getX_Storage().get(22);
                        break;
                    case 8:
                        line = getX_Storage().get(3) + getX_Storage().get(8) + getX_Storage().get(13) + getX_Storage().get(18) + getX_Storage().get(23);
                        break;
                    case 9:
                        line = getX_Storage().get(4) + getX_Storage().get(9) + getX_Storage().get(14) + getX_Storage().get(19) + getX_Storage().get(24);
                        break;
                    case 10:
                        line = getX_Storage().get(0) + getX_Storage().get(6) + getX_Storage().get(12) + getX_Storage().get(18) + getX_Storage().get(24);
                        break;
                    case 11:
                        line = getX_Storage().get(4) + getX_Storage().get(8) + getX_Storage().get(12) + getX_Storage().get(16) + getX_Storage().get(20);
                        break;
                }

                if (line.equals("XXXXX")) {
                    setWinner_TRUE();
                }
            }
        } else if (player.assignment == "O") {
            for (int a = 0; a < 12; a++) {
                switch(a) {
                    case 0:
                        line = getO_Storage().get(0) + getO_Storage().get(1) + getO_Storage().get(2) + getO_Storage().get(3) + getO_Storage().get(4);
                        break;
                    case 1:
                        line = getO_Storage().get(5) + getO_Storage().get(6) + getO_Storage().get(7) + getO_Storage().get(8) + getO_Storage().get(9);
                        break;
                    case 2:
                        line = getO_Storage().get(10) + getO_Storage().get(11) + getO_Storage().get(12) + getO_Storage().get(13) + getO_Storage().get(14);
                        break;
                    case 3:
                        line = getO_Storage().get(15) + getO_Storage().get(16) + getO_Storage().get(17) + getO_Storage().get(18) + getO_Storage().get(19);
                        break;
                    case 4:
                        line = getO_Storage().get(20) + getO_Storage().get(21) + getO_Storage().get(22) + getO_Storage().get(23) + getO_Storage().get(24);
                        break;
                    case 5:
                        line = getO_Storage().get(0) + getO_Storage().get(5) + getO_Storage().get(10) + getO_Storage().get(15) + getO_Storage().get(20);
                        break;
                    case 6:
                        line = getO_Storage().get(1) + getO_Storage().get(6) + getO_Storage().get(11) + getO_Storage().get(16) + getO_Storage().get(21);
                        break;
                    case 7:
                        line = getO_Storage().get(2) + getO_Storage().get(7) + getO_Storage().get(12) + getO_Storage().get(17) + getO_Storage().get(22);
                        break;
                    case 8:
                        line = getO_Storage().get(3) + getO_Storage().get(8) + getO_Storage().get(13) + getO_Storage().get(18) + getO_Storage().get(23);
                        break;
                    case 9:
                        line = getO_Storage().get(4) + getO_Storage().get(9) + getO_Storage().get(14) + getO_Storage().get(19) + getO_Storage().get(24);
                        break;
                    case 10:
                        line = getO_Storage().get(0) + getO_Storage().get(6) + getO_Storage().get(12) + getO_Storage().get(18) + getO_Storage().get(24);
                        break;
                    case 11:
                        line = getO_Storage().get(4) + getO_Storage().get(8) + getO_Storage().get(12) + getO_Storage().get(16) + getO_Storage().get(20);
                        break;
                }

                if (line.equals("OOOOO")) {
                    setWinner_TRUE();
                }
            }
        }


    }

    public int getAI_Choice() {
        return AI_Choice;
    }

    void setPlayer(Player p) {
        this.player = p;
    }
    
    public Player getPlayer() {
        return player;
    }

    public static Vector<String> getO_Storage() {
        return O_Storage;
    }

    public static Vector<String> getX_Storage() {
        return X_Storage;
    }

    public void setIs_X(boolean x) {
        is_X = x;
    }

    public boolean getis_X() {
        return is_X;
    }

    public static void setWinner_TRUE() {
        winner = true;
    }

}
