
//import view.GameBoardModel;
import view.MenuChoiceScreen;

import javax.swing.JFrame;


class Main {


    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Tic-Tac-Toe");
        window.setLocation(500,200);


        //var game = new GameBoardModel(window);
        //game.init();

        var game = new MenuChoiceScreen(window);
        game.init();

        window.setResizable(false);
        window.pack();
        window.setVisible(true);
      

    }
}