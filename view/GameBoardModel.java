package view;

import javax.swing.JPanel;
import model.TTT;

import controller.GamePlayListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


public class GameBoardModel {

    public enum GameState {
        PLAYER1, PLAYER2, AI, CHOOSE
    }

    private TTT ttt;

    private JFrame window;
    private JButton[] gameButtons;
    private JButton quitButton = new JButton("Quit");
    private JButton hVsAiButton = new JButton("Human vs AI");
    private JButton aIvSaIButton = new JButton("AI vs AI");
    private GameState gameState = GameState.CHOOSE;
    private Icon emptySquare = new ImageIcon("images/resizeEmpty.png");
    private Icon xIcon = new ImageIcon("images/xIcon.png");


    public GameBoardModel(JFrame window){
        this.window = window;
    }


    public void init(){

        Container cp = window.getContentPane();
        GamePlayListener buttonListener = new GamePlayListener(this);
        

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(5, 5));

        gameButtons = new JButton[25];

        for (int j = 0; j < 25; j++){
            gameButtons[j] = new JButton(emptySquare);
            boardPanel.add(gameButtons[j]);
            gameButtons[j].addActionListener(buttonListener);
        }

        for (var b: gameButtons){
            b.setEnabled(false);
        }

        

        cp.add(BorderLayout.CENTER, boardPanel);
        

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        

        southPanel.add(quitButton);
        southPanel.add(hVsAiButton);
        southPanel.add(aIvSaIButton);
        quitButton.setEnabled(false);
        hVsAiButton.setEnabled(true);
        aIvSaIButton.setEnabled(true);
        quitButton.addActionListener(buttonListener);
        hVsAiButton.addActionListener(buttonListener);
        aIvSaIButton.addActionListener(buttonListener);

        cp.add(BorderLayout.SOUTH, southPanel);

        
    } // end of init

    public GameState getGameState(){
        return gameState;
    }

    public void setGameState(GameState state){
        this.gameState = state;
    }

    public JButton getQuitButton() {
        return quitButton;
    }

    public JButton getaIvSaIButton() {
        return aIvSaIButton;
    }

    public JButton gethVsAiButton() {
        return hVsAiButton;
    }

    public JButton[] getGameButtons() {
        return gameButtons;
    }

    public Icon getxIcon() {
        return xIcon;
    }

    public TTT getTTT() {
        return ttt;
    }

    
}
