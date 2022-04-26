package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.Container;
import java.awt.BorderLayout;


public class MenuChoiceScreen {

    private JFrame window; 
    private GameBoardModel p1Game;
    //private GameBoardModel aiGame;
    

    public MenuChoiceScreen(JFrame window){
        this.window = window;
    }

    public void init() {

        Container cp = window.getContentPane();

        JButton p1Button = new JButton("Player vs AI");
        JButton aiButton = new JButton("AI vs AI");
        p1Button.setFocusable(false);
        aiButton.setFocusable(false);
        p1Button.setEnabled(true);
        aiButton.setEnabled(true);

        JPanel southPanel = new JPanel();
        southPanel.add(p1Button);
        southPanel.add(aiButton);
        cp.add(BorderLayout.SOUTH, southPanel);

        p1Button.addActionListener(event -> {

            window.getContentPane().removeAll();
            p1Game = new GameBoardModel(window);
            p1Game.init();
            window.pack();
            window.setVisible(true);
            window.setLocation(200,100);

        });

        aiButton.addActionListener(event -> {

            JOptionPane.showMessageDialog(null, 
            "AI to AI Feature not implemented yet",
            "PopUp Dialog", 
            JOptionPane.WARNING_MESSAGE);
        });



    }


    
}
