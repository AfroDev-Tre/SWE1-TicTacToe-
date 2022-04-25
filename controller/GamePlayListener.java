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

        if (button == model.gethVsAiButton()){

            // create new human vs ai game

            model.getQuitButton().setEnabled(true);
            model.getaIvSaIButton().setEnabled(false);
            model.gethVsAiButton().setEnabled(false);

            for (var b:model.getGameButtons()){
                b.setEnabled(true);
            }



            
        } else if (button == model.getQuitButton()){

            model.getQuitButton().setEnabled(false);
            model.getaIvSaIButton().setEnabled(true);
            model.gethVsAiButton().setEnabled(true);

            for (var b:model.getGameButtons()){
                b.setEnabled(false);

            }

            // maybe also reset images in JButton ImageIcon to be blank squares
        } else if (button == model.getaIvSaIButton()){

            model.getQuitButton().setEnabled(true);
            model.getaIvSaIButton().setEnabled(false);
            model.gethVsAiButton().setEnabled(false);

            for (var b:model.getGameButtons()){
                b.setEnabled(true);
            }

        }
        
    }


    
}
