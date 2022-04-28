import javax.swing.JFrame;

import model.GameBoard;

class Main {
    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Tic-Tac-Toe");
        window.setLocation(200,100);

        var game = new GameBoardModel(window);
        game.init();

    }
}