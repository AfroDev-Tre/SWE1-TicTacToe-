package model;
public class Player {

    private char playerChoice;
    private String playerName;

    public Player(){


    }

    public void setPlayerChoice(char playerChoice) {
        this.playerChoice = playerChoice;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public char getPlayerChoice() {
        return playerChoice;
    }

    public String getPlayerName() {
        return playerName;
    }
    
}
