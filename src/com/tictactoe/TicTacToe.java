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
    private static void printBoard() {
        System.out.println("-------");
        System.out.println("|" + board[1] + "|" + board[2] + "|" + board[3] + "|");
        System.out.println("-------");
        System.out.println("|" + board[4] + "|" + board[5] + "|" + board[6] + "|");
        System.out.println("-------");
        System.out.println("|" + board[7] + "|" + board[8] + "|" + board[9] + "|");
        System.out.println("-------");
    }

    public static void main(String[] args) {
        initGame();
        selection();
        printBoard();
    }
}