package view;

import javax.swing.JPanel;

import controller.GamePlayListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;


public class GameBoardModel {

    private JFrame window;
    private JButton[] gameButtons;
    private Icon emptySquare = new ImageIcon("images/resizeEmpty.png");


    public GameBoardModel(JFrame window){
        this.window = window;
    }


    public void init(){

        Container cp = window.getContentPane();

        JPanel boardPanel = new JPanel();

        boardPanel.setLayout(new GridLayout(5, 5));

        GamePlayListener buttonListener = new GamePlayListener(this);

        gameButtons = new JButton[25];

        for (int j = 0; j < 25; j++){
            gameButtons[j] = new JButton(emptySquare);
            boardPanel.add(gameButtons[j]);
            gameButtons[j].addActionListener(buttonListener);
        }

        for (var b: gameButtons){
            b.setEnabled(true);
        }

        cp.add(BorderLayout.CENTER, boardPanel);

        
    }
}
