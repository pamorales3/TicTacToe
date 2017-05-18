import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * A class that simulates the Tic Tac Toe Game GUI
 * aspect such as by drawing the game board,
 * game pieces, and the overall functions like
 * checking for win and draw states.
 * @author patrickmorales
 * @version 1.0
 * @since 2017-02-6
 */
public class TicTacToeMainFrame extends JFrame{
    JButton[][] gameSlots = new JButton[3][3];     // Array of Buttons to be the Slots
    JPanel board = new JPanel();			       // Area for the Tic Tac Toe Game Board
    JPanel menu = new JPanel(new BorderLayout());  // Overall section for buttons
    JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));  // Sub section for buttons
    JButton playButton = new JButton("Play");      // Play Button
    private JLabel msg = new JLabel();             // Message Label for player turn and win/draw state
    
    /**
     * The constructor that creates the whole board along
     * with the pieces, and calls the methods to check
     * the overall status of the game to initiate a
     * win state, draw state, or a new game state.
     */
    public TicTacToeMainFrame(){
        // --------------------------------------------------------------
        //		The General Frame for the board
        setTitle("Tic Tac Toe");
        setSize(600,600);
        setResizable(false);
        setLocationRelativeTo(null);
        menu.setBorder(BorderFactory.createEmptyBorder(40,50,40,50));
        msg.setBorder(BorderFactory.createEmptyBorder(20,30,10,20));
        menu.setLayout(new GridLayout(1,1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // --------------------------------------------------------------
        //      Game Board Panel
        board.setLayout(new GridLayout(3,3));
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                gameSlots[row][col] = new JButton("");
                gameSlots[row][col].setFocusPainted(false);
                gameSlots[row][col].setFont(new Font("Arial", Font.PLAIN, 215));
                board.add(gameSlots[row][col]);
                gameSlots[row][col].addActionListener(this::gameSlotsPressed);
            }
        }
        add(board, BorderLayout.CENTER);
        // --------------------------------------------------------------
        //      Options Menu Panel
        buttons.add(playButton);
        playButton.setFocusPainted(false);
        playButton.addActionListener(this::playButtonPressed);
        buttons.add(msg, BorderLayout.SOUTH);
        add(buttons, BorderLayout.NORTH);
        showMessage("Player 1's" + " turn");
        setVisible(true);
    }
    
    /**
     * An ActionEvent for when the play button is pressed,
     * the game restarts if the game is there is a winner or
     * if the player(s) decide to start a new game.
     * @param event the event that is triggered by the play button
     */
    private void playButtonPressed(ActionEvent event) {
        if (isWin()) {
            resetBoard();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Start a new game?", "Tic Tac Toe",
                                              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resetBoard();
            }
        }
    }
    
    /**
     * An ActionEvent for when one of the slots is chosen that calls
     * the check win and check draw methods and draws the piece that
     * corresponds with the current player and also displays the winner
     * and there is a draw.
     * @param event the even that is triggered when a game slot is pressed
     */
    private void gameSlotsPressed(ActionEvent event){
        String player;      // Current Player Piece
        int playerNumber;   // Current Player- Player 1 or Player 2
        int nextPlayer;     // Player who's turn is next after current player
        Color color;        // Color to fill current players piece
        
        if(currentSpotsTaken() % 2 == 0){
            player = "X";
            color = Color.RED;
            playerNumber = 1;
            nextPlayer = 2;
        }else{
            player = "O";
            color = Color.BLUE;
            playerNumber = 2;
            nextPlayer = 1;
        }
        if(!isWin()){
            if(event.getSource() == gameSlots[0][0]){
                gameSlots[0][0].setText(player);
                gameSlots[0][0].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[0][1]){
                gameSlots[0][1].setText(player);
                gameSlots[0][01].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[0][2]){
                gameSlots[0][2].setText(player);
                gameSlots[0][2].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[1][0]){
                gameSlots[1][0].setText(player);
                gameSlots[1][0].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[1][1]){
                gameSlots[1][1].setText(player);
                gameSlots[1][1].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[1][2]){
                gameSlots[1][2].setText(player);
                gameSlots[1][2].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[2][0]){
                gameSlots[2][0].setText(player);
                gameSlots[2][0].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[2][1]){
                gameSlots[2][1].setText(player);
                gameSlots[2][1].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
            else if(event.getSource() == gameSlots[2][2]){
                gameSlots[2][2].setText(player);isWin();
                gameSlots[2][2].setForeground(color);
                showMessage("Player " + nextPlayer + "'s" + " turn");
                if(isWin())
                    showMessage("Player " + playerNumber + " Wins!");
                else if(isDraw())
                    showMessage("Draw!");
            }
        }
    }
    
    /**
     * Resets the game board to empty strings to intiate
     * a new game.
     */
    private void resetBoard(){
        showMessage("Player 1's" + " turn");
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                gameSlots[row][col].setText("");
                gameSlots[row][col].setEnabled(true);
            }
        }
    }
    
    /**
     * Returns a boolean if all the spots on the board
     * have been been occupied by both players pieces.
     * @return true or false depending on if the board is full.
     */
    public boolean isDraw(){
        if(currentSpotsTaken() == 9)
            return true;
        else
            return false;
    }
    
    /**
     * Returns the number of spots that are currently
     * taken by any of the players.
     * @return currentSpots the number of spots that are currently taken.
     */
    public int currentSpotsTaken(){
        int currentSpots = 0;
        for(int rows = 0; rows < 3; rows++){
            for(int col = 0; col < 3; col++){
                if(gameSlots[rows][col].getText() != "")
                    currentSpots++;
            }
        }
        return currentSpots;
    }
    
    /**
     * Returns true if any of the players has just won the game
     * and false otherwise.
     * @return true or false if any of the players won.
     */
    public boolean isWin(){
        if(checkHorizontalWin())
            return true;
        else if(checkVerticalWin())
            return true;
        else if(checkLeftDiagonalWin())
            return true;
        else if(checkRightDiagonalWin())
            return true;
        else
            return false;
    }
    
    /**
     * Returns true if the first player "X" or the second player "O"
     * has a horizontal win and false otherwise.
     * @return true or false depending if player 1 or 2 has won the game.
     */
    public boolean checkHorizontalWin(){
        if((gameSlots[0][0].getText() == "X") && (gameSlots[0][1].getText() == "X") && (gameSlots[0][2].getText() == "X")
           || (gameSlots[0][0].getText() == "O") && (gameSlots[0][1].getText() == "O") && (gameSlots[0][2].getText() == "O"))
            return true;
        else if((gameSlots[1][0].getText() == "X") && (gameSlots[1][1].getText() == "X") && (gameSlots[1][2].getText() == "X")
                || (gameSlots[1][0].getText() == "O") && (gameSlots[1][1].getText() == "O") && (gameSlots[1][2].getText() == "O"))
            return true;
        else if((gameSlots[2][0].getText() == "X") && (gameSlots[2][1].getText() == "X") && (gameSlots[2][2].getText() == "X")
                || (gameSlots[2][0].getText() == "O") && (gameSlots[2][1].getText() == "O") && (gameSlots[2][2].getText() == "O"))
            return true;
        else
            return false;
    }
    
    /**
     * Returns true if the first player "X" or the second player "O"
     * has a vertical win and false otherwise.
     * @return true or false depending on if player 1 or 2 won the game.
     */
    public boolean checkVerticalWin(){
        if((gameSlots[0][0].getText() == "X") && (gameSlots[1][0].getText() == "X") && (gameSlots[2][0].getText() == "X")
           || (gameSlots[0][0].getText() == "O") && (gameSlots[1][0].getText() == "O") && (gameSlots[2][0].getText() == "O"))
            return true;
        else if((gameSlots[0][1].getText() == "X") && (gameSlots[1][1].getText() == "X") && (gameSlots[2][1].getText() == "X")
                || (gameSlots[0][1].getText() == "O") && (gameSlots[1][1].getText() == "O") && (gameSlots[2][1].getText() == "O"))
            return true;
        else if((gameSlots[0][2].getText() == "X") && (gameSlots[1][2].getText() == "X") && (gameSlots[2][2].getText() == "X")
                || (gameSlots[0][2].getText() == "O") && (gameSlots[1][2].getText() == "O") && (gameSlots[2][2].getText() == "O"))
            return true;
        else
            return false;
    }
    
    /**
     * Returns true if the first player "X" or the second player "O"
     * has a left diagonal win and false otherwise.
     * @return true or false depending on if player 1 or 2 won the game. 
     */
    public boolean checkLeftDiagonalWin(){
        if((gameSlots[2][2].getText() == "X") && (gameSlots[1][1].getText() == "X") && (gameSlots[0][0].getText() == "X")
           || (gameSlots[2][2].getText() == "O") && (gameSlots[1][1].getText() == "O") && (gameSlots[0][0].getText() == "O"))
            return true;
        else
            return false;
    }
    
    /**
     * Returns true if the first player "X" or the second player "O"
     * has a right diagonal win and false otherwise.
     * @return true or false depending on if player 1 or 2 won the game. 
     */
    public boolean checkRightDiagonalWin(){
        if((gameSlots[2][0].getText() == "X") && (gameSlots[1][1].getText() == "X") && (gameSlots[0][2].getText() == "X")
           || (gameSlots[2][0].getText() == "O") && (gameSlots[1][1].getText() == "O") && (gameSlots[0][2].getText() == "O"))
            return true;
        else
            return false;
    }
    
    /**
     * Displays the status of the game such as who one and the current
     * players turn
     * @param message
     */
    private void showMessage(String message) {
        msg.setText(message);
    }
    
    /**
     * REFERENCES
     * This is the reference that I used for creating my Tic Tac Toe Game such as
     * the overall look of how the game was made.
     * http://codereview.stackexchange.com/questions/57141/tic-tac-toe-game-in-java-oop
     * I used the java file "C4Dialog.java" to implement the showMessage() method and
     * the playButtonedClicked() method for my java program. The C4Dialog.java file was 
     * created by Dr. Cheon, a UTEP Professor that I had for Design and Implementation for
     * Programming Languages.
     */
}
