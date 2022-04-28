package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


import view.GameBoardModel;


//import model.GameSpace;

public class GamePlayListener implements ActionListener {

    private GameBoardModel model;
    //private GameSpace[] gameSpaces;


    public GamePlayListener(GameBoardModel model){
        this.model = model;
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();

        // button.setIcon(model.getxIcon());

        if (button == model.gethVsAiButton()){

            // create new human vs ai game

            model.getQuitButton().setEnabled(true);
            model.getaIvSaIButton().setEnabled(false);
            model.gethVsAiButton().setEnabled(false);

            for (var b:model.getGameButtons()){
                b.setEnabled(true);
            }

            if (model.getP1Button().isSelected()){

                // assign human to play first and assign to x or o
            }

            else {
                
                // they play second 

            }

            
/*
            HumanGame hgame = new HumanGame();
            
            // generate gameSpace objects to go with game 
            for(int i = 0; i < 25; i++){
                gameSpaces[i] = new GameSpace();
            }

            for (int j=0; j<25; j++){
                if(e.getSource() == model.getGameButtons()){
                    
                }
            } */



            

            



            
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

        } else {

            button.setEnabled(false);
            button.setIcon(model.getxIcon());
        }

        
    }


    
}
