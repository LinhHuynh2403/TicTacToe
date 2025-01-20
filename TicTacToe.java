// this will be the 5x5 tic tac toe game
import java.util.*;

public class TicTacToe {
    // create 2 static variable since we will use them thru the program
    static String turn;
    static String[] board;

    // check winner method decide the combination
    static String checkWinner() {
        // // check row (horizontal) 
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 2; i++) {
        //         String line = board[i*5+j] + board[i*5+j+1] + board[i*5+j+2] + board[i*5+j+3];
        //         if (line.equals("XXXX")) {
        //             return "X";
        //         } else if (line.equals("OOOO")) {
        //             return "O";
        //         }
        //     }
        // }

        // // checl col (vertical) 
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         String line = board[i+j*5] +  board[i+(j+1)*5] +  board[i+(j+2)*5] +  board[i+(j+3)*5];
        //         if (line.equals("XXXX")) {
        //             return "X";
        //         } else if (line.equals("OOOO")) {
        //             return "O";
        //         }
        //     }
        // }

        // // Check diagonal (top-left to bottom-right)
        // for (int i = 0; i <= 1; i++) { // Only two diagonals can have 4 consecutive marks
        //     String line = board[i * 5] + board[(i + 1) * 6] + board[(i + 2) * 7] + board[(i + 3) * 8];
        //     if (line.equals("XXXX")) {
        //         return "X";
        //     } else if (line.equals("OOOO")) {
        //         return "O";
        //     }
        // }

        // // Check diagonal (top-right to bottom-left)
        // for (int i = 0; i < 2; i++) { // Only two diagonals can have 4 consecutive marks
        //     String line = board[(i + 1) * 4] + board[(i + 2) * 3] + board[(i + 3) * 2] + board[(i + 4) * 1];
        //     if (line.equals("XXXX")) {
        //         return "X";
        //     } else if (line.equals("OOOO")) {
        //         return "O";
        //     }
        // }

        // // Check for draw (if no empty spaces left)
        // for (int i = 0; i < 25; i++) {
        //     if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
        //         break;
        //     } else if (i == 24) {
        //         return "draw";
        //     }
        // }

         // there is 18 cases for winner in 5x5
        for (int i = 0; i < 18; i++) {
            String line = null;

            switch(i) {
                case 0:
                    line = board[0] + board[1] + board[2] + board[3] + board[4];
                    break;
                case 1:
                    line = board[5] + board[6] + board[7] + board[8] + board[9];
                    break;
                case 2:
                    line = board[10] + board[11] + board[12] + board[13] + board[14];
                    break;
                case 3:
                    line = board[15] + board[16] + board[17] + board[18] + board[19];
                    break;
                case 4:
                    line = board[20] + board[21] + board[22] + board[23] + board[24];
                    break;
                case 5:
                    line = board[0] + board[5] + board[10] + board[15] + board[20];
                    break;
                case 6:
                    line = board[1] + board[6] + board[11] + board[16] + board[21];
                    break;
                case 7:
                    line = board[2] + board[7] + board[12] + board[17] + board[22];
                    break;
                case 8:
                    line = board[3] + board[8] + board[13] + board[18] + board[23];
                    break;
                case 9:
                    line = board[4] + board[9] + board[14] + board[19] + board[24];
                    break;
                case 10:
                    line = board[0] + board[6] + board[12] + board[18];
                    break;
                case 11:
                    line = board[1] + board[7] + board[13] + board[19];                    
                    break;
                case 12:
                    line = board[3] + board[7] + board[11] + board[15];
                    break;
                case 13:
                    line = board[5] + board[8] + board[12] + board[16];
                    break;
                case 14:
                    line = board[5] + board[11] + board[17] + board[22];
                    break;
                case 15:
                    line = board[6] + board[12] + board[18] + board[24];
                    break;
                case 16:
                    line = board[8] + board[12] + board[16] + board[20];
                    break;
                case 17:
                    line = board[9] + board[13] + board[17] + board[21];
                    break;
            }
            // For X winner
            if (line.equals("XXXX")) {
                return "X";
            } else if (line.equals("OOOO")) {
                return "O";
            }
        }

        for (int i = 0; i < 25; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i+1))) {
                break;
            } else if (i == 24) {
                return "draw";
            }
        }
        
        // to enter X or O at the exact place on board
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in: ");
        return null;
    }

    // printBoard method
    /*
    |-----|-----|-----|-----|-----|
    |  1  |  2  |  3  |  4  |  5  |
    |-----|-----|-----|-----|-----|
    |  6  |  7  |  8  |  9  | 10  |
    |-----|-----|-----|-----|-----|
    | 11  | 12  | 13  | 14  | 15  |
    |-----|-----|-----|-----|-----|
    | 16  | 17  | 18  | 19  | 20  |
    |-----|-----|-----|-----|-----|
    | 21  | 22  | 23  | 24  | 25  | 
    |-----|-----|-----|-----|-----|
    */

    static void printBoard() {
        System.out.println("|-----|-----|-----|-----|-----|");
        System.out.println("|  " + board[0] + "  |  " + board[1] + "  |  " + board[2] + "  |  " + board[3] + "  |  " + board[4]+ "  |");
        System.out.println("|-----|-----|-----|-----|-----|");
        System.out.println("|  " + board[5] + "  |  " + board[6] + "  |  " + board[7] + "  |  " + board[8] + "  | " + board[9]+ "  |");
        System.out.println("|-----|-----|-----|-----|-----|");
        System.out.println("| " + board[10] + "  | " + board[11] + "  | " + board[12] + "  | " + board[13] + "  | " + board[14]+ "  |");
        System.out.println("|-----|-----|-----|-----|-----|");
        System.out.println("| " + board[15] + "  | " + board[16] + "  | " + board[17] + "  | " + board[18] + "  | " + board[19]+ "  |");
        System.out.println("|-----|-----|-----|-----|-----|");
        System.out.println("| " + board[20] + "  | " + board[21] + "  | " + board[22] + "  | " + board[23] + "  | " + board[24]+ "  |");
        System.out.println("|-----|-----|-----|-----|-----|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[25];
        turn = "X";
        String winner = null;

        for (int i = 0; i < 25; i++) {
            board[i] = String.valueOf(i + 1);
        }
        System.out.println("Welcome to 5x5 Tic Tac Toe");
        printBoard();

        System.out.println("X will play first. Please enter a slot number to place X in: ");

        while (winner == null) {
            int numInput;

            // exception handling when player enter a slot number that is not in the board
            // if it is not in range from 1 to 25

            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 25)) {
                    System.out.println("Invalid input; re-enter slot number: ");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number: ");
                continue;
            }
            
            // this game has two player X and O 
            // here is the logic to decide the turn 

            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;
                
                // for appearance after place X or O in the board
                if (numInput >= 10 || numInput <= 25) {
                    if (turn.equals("X")) {
                        turn = " O"; 
                    } else {
                        turn = " X";
                    }
                } else {
                    if (turn.equals("X")) {
                        turn = "O"; 
                    } else {
                        turn = "X";
                    }
                }

                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot is already taken, re-enter new slot number: ");
            }
        }

        // if no one win or lose from both player X or O 
        // logic for draw
        if (winner.equalsIgnoreCase("Draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } 

        // for winner to display congratulation message
        else {
            System.out.println("Congratulation! " + winner + "'s have won. Thanks for playing.");
        }
        in.close();
    }
}