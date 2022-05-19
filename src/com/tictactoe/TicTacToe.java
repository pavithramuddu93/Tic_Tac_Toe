package com.tictactoe;
import java.util.Scanner;

public class TicTacToe {

    public static char playerChoice;
    public static char compChoice;
    public static int size = 10;
    public static char[] board = new char[size];

    public static void initGame() {
        System.out.println();
        for (int index = 1; index < size; ++index) {
            board[index] = ' ';  // all cells empty
            System.out.println("Value of index " + index + " is " + board[index]);
        }
    }
    public static void selection() {
        System.out.println("\nWould you like to choose 'x' or 'o' to play");
        Scanner input = new Scanner(System.in);
        playerChoice = input.next().charAt(0);
        if (playerChoice == 'x' || playerChoice == 'X') {
            compChoice = 'o';
        } else {
            compChoice = 'x';
            playerChoice = 'o';
        }
    }
    public static void main(String[] args) {
        initGame();
        selection();
    }
}