package model;
import java.util.Scanner;

public class GameBoard {

    boolean gameOver = false;
    
    //private Player player1 = new Player();
    //private Player player2 = new Player();
    private int column;
    private int row;
    private boolean spaceUsed = false;
    private char choice;
    

    Scanner userInput = new Scanner(System.in);


public GameBoard(){

    // once controller is made, this will pass the instance of the window

}

public void init(){

    // create array of gamespace objects
    GameSpace[][] gameBoard = new GameSpace[5][5];


    // initialize tic-tac-toe board

    
   for(int i = 0; i < 5; i++){
       for(int j = 0; j < 5; j++){

        gameBoard[i][j] = new GameSpace();
        
        
       } 
   } // end of both for loops


   playGame(gameBoard);

   System.out.println("Game Over");

}

void playGame(GameSpace[][] gameBoard){

    // player picks space on board
    // call function to see if space is available 
    // if space is available, mark space and check for win
    // if space is occuped, prompt user again

    // once gui is created, this should be under controller for game logic

    while (gameOver == false){

        displayBoard(gameBoard);

        // internal loop for player 

        while (spaceUsed == false){

        System.out.println("Enter column no: ");
        column = userInput.nextInt();

        System.out.println("Enter row no: ");
        row = userInput.nextInt();

        spaceUsed = checkSpace(gameBoard, column, row);

        }

        // mark space with an X or O (no player 1 or 2 yet)
        System.out.println("Enter X or O to mark space: ");
        choice = userInput.next().charAt(0);

        gameBoard[column][row].setMarkSpace(choice);

        // check for a win, call checkWin method

        gameOver = checkWin(gameBoard, choice);
        spaceUsed = false;

        if (gameOver == true){
            System.out.println("You win!");
        }

    }

    

} // end of playGame method


boolean checkWin(GameSpace[][] gameBoard, char choice){

    // checkWin method checks the 2d array for a win after every play 

    boolean proceed = false;

    // check every column

    for (int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++){
            if (gameBoard[i][j].getSpaceUsed() == false) {
                return false;
            }

            if (gameBoard[i][j].getMarkSpace() == choice) {
                proceed = true;
            }
            else return false;

            
        }

        if (proceed == true) return true;
        else proceed = false;
    }

    // check every row
    proceed = false;

    for (int i = 0; i < 5; i ++){
        for (int j = 0; j < 5; j++){
            if (gameBoard[j][i].getSpaceUsed() == false) {
                return false;
            }

            if (gameBoard[j][i].getMarkSpace() == choice) {
                proceed = true;
            }

            else return false;
        }
        if (proceed == true) return true;
        else proceed = false;
    }

    // check diagonal left to right
    proceed = false;

    for (int i = 0; i < 5; i++){
        if (gameBoard[i][i].getSpaceUsed() == false){
            return false;
        }

        if (gameBoard[i][i].getMarkSpace() == choice){
            proceed = true;
        }
        else return false;

    
    }

    if (proceed == true) return true;
    else proceed = false;

    // check diagonal right to left

    for (int i = 4; i >= 0; i--){
        for (int j = 0; j < 5; j++){
            if (gameBoard[i][j].getSpaceUsed() == false){
                return false;
            }

            if (gameBoard[i][j].getMarkSpace() == choice){
                proceed = true;
            }
            else return false;

        }
    }

    if (proceed == true) return true;
    else return false;

    
}
boolean checkSpace(GameSpace[][] gameBoard, int column, int row){

    // check to see if game piece is already there
    if (gameBoard[column][row].getSpaceUsed() == false){

        // change boolean value to true
        gameBoard[column][row].setSpaceUsed(true);
        
        return true;
    }
    else  {
        
        System.out.println("Space already occupied");
        return false;
    }

}

void displayBoard(GameSpace[][] gameBoard){

    

        for (int m = 0; m < 5; m++){

            for (int n = 0; n < 5; n++){

                    System.out.print("_" + " " + "|");
                
            }
            System.out.println();
        }
}



    
} // end of class
