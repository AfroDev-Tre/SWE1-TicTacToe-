package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.TTT;
import model.TTT.Player;
import view.GameBoardModel;
import model.HumanGame;
import model.TTT;


//import model.GameSpace;

public class GamePlayListener implements ActionListener {

    private GameBoardModel model;
    //private GameSpace[] gameSpaces;
    private TTT tGame;


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

                // they play second and assign to x or so

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

            // perhaps we should do a while loop here 
            // while (getWinner() == false)





            

            



            
        } else if (button == model.getaIvSaIButton()){

            model.getTTT().playGame();
            model.getTTT().setPlayer(TTT.Player.AI);
            model.getTTT().getPlayer().setAssignment("X");
            model.getTTT().setPlayer(TTT.Player.AI2);
            model.getTTT().getPlayer().setAssignment("O");

            //while (model.getTTT().getWinner() == false || )

            model.getQuitButton().setEnabled(true);
            model.getaIvSaIButton().setEnabled(false);
            model.gethVsAiButton().setEnabled(false);

            for (var b:model.getGameButtons()){
                b.setEnabled(true);
            }

        } else {

            button.setEnabled(false);

            for (int k=0; k < 25; k++){

                if (button == model.getGameButtons()[k]){

                    //model.getGameButtons()[k].setEnabled(false);
                    model.getGameButtons()[k].setText("X");
                    model.getGameButtons()[k].setEnabled(false);
                    System.out.println(model.getGameButtons()[k]);
                }
            }
            
        }

        
    }


    
}
