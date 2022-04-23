package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


import view.GameBoardModel;

public class GamePlayListener implements ActionListener {

    private GameBoardModel model;


    public GamePlayListener(GameBoardModel model){
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();

        button.setEnabled(false);
        
    }


    
}
