package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.TTT;
import model.TTT.Player;
import view.GameBoardModel;

public class GamePlayListener implements ActionListener {

    private GameBoardModel model;


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

            

            



            
        } else if (button == model.getQuitButton()){

            model.getQuitButton().setEnabled(false);
            model.getaIvSaIButton().setEnabled(true);
            model.gethVsAiButton().setEnabled(true);

            for (var b:model.getGameButtons()){
                b.setEnabled(false);

            }

            // maybe also reset images in JButton ImageIcon to be blank squares
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

        }
        
    }


    
}
