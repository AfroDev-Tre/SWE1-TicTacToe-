package view;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;


public class GameBoardModel {

    private JFrame window;
    private JButton[] gameButtons;

    public GameBoardModel(JFrame window){
        this.window = window;
    }


    public void init(){

        Container cp = window.getContentPane();

        JPanel boardPanel = new JPanel();

        boardPanel.setLayout(new GridLayout(5, 5));

        gameButtons = new JButton[25];

        for (int j = 0; j < 25; j++){
            gameButtons[j] = new JButton();
            boardPanel.add(gameButtons[j]);
        }

        for (var b: gameButtons){
            b.setEnabled(true);
        }

        cp.add(BorderLayout.CENTER, boardPanel);

        
    }
}
