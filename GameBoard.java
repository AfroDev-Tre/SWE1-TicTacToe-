import java.util.Scanner;

public class GameBoard {

    boolean gameOver = false;
    int row;
    int column;

public GameBoard(){


}

public void init(){

    // create array of gamespace objects
    GameSpace[][] gameBoard = new GameSpace[5][5];


    // initialize tic-tac-toe board
   for(int i = 0; i < 5; i++){
       for(int j = 0; j < 5; j++){

        gameBoard[i][j] = new GameSpace();
        gameBoard[i][j].setX(i);
        gameBoard[i][j].setY(j);
        
        System.out.println(gameBoard[i][j].getX() + " ");
        System.out.println(gameBoard[i][j].getY() + " ");
        System.out.println(gameBoard[i][j].getSpaceUsed() + " ");
        
       } 
   } // end of both for loops

   // create 2 players
   Player player1 = new Player();
   Player player2 = new Player();

   player1.setPlayerChoice('X');
   player2.setPlayerChoice('O');

   // this code is for testing, for display board and testing the 
   // getters and setters for marking spaces with x's and o's

   gameBoard[0][0].setSpaceUsed(true);
   gameBoard[0][0].setMarkSpace('X');
   gameBoard[0][1].setSpaceUsed(true);
   gameBoard[0][1].setMarkSpace('O');

   playGame(gameBoard);

   System.out.println("Game Over");

}

void playGame(GameSpace[][] gameBoard){

    // until the game is developed further, player1 is x and player 2 is o
    // use a while loop to continue game play

    

    while (gameOver == false){

        displayBoard(gameBoard);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Player1, enter the column: ");
        column = userInput.nextInt();

        System.out.println("Player1, enter the row: ");
        row = userInput.nextInt();

        userInput.close();

        boolean proceed = checkSpace(gameBoard, column, row);

       while (proceed == false){

        System.out.println("Cannot use that space. ");

       }

       
         
        
        gameOver = true;
      

    }

    System.out.println("Game Over");

}

boolean checkWin(GameSpace[][] gameBoard){

    // checkWin method checks the 2d array for a win after every play 

    gameOver = false;

    return gameOver;
}
boolean checkSpace(GameSpace[][] gameBoard, int column, int row){

    // check to see if game piece is already there
    if (gameBoard[column][row].getSpaceUsed() == false){
        gameBoard[column][row].setSpaceUsed(true);
        return true;
    }
    else  {
        
        System.out.println("Space already occupied");
        return false;
    }

}

void playerMove(GameSpace[][] gameBoard){

    Scanner userInput = new Scanner(System.in);

    System.out.println("Player1, enter the column: ");
        column = userInput.nextInt();

    System.out.println("Player1, enter the row: ");
        row = userInput.nextInt();

    userInput.close();


}

void displayBoard(GameSpace[][] gameBoard){

    char displayPiece;

        for (int m = 0; m < 5; m++){

            for (int n = 0; n < 5; n++){


                if (gameBoard[m][n].getSpaceUsed() == false){
                    System.out.print("__" + "|");
                }

                else {
                    displayPiece = gameBoard[m][n].getMarkSpace();
                    System.out.print(" " + displayPiece + " ");
                }
                
            }
            System.out.println();
        }
}



    
} // end of class
