package com.tictactoe;
import java.util.Scanner;

public class TicTacToe {

    public static Scanner input = new Scanner(System.in);
    public static char choice;
    public static int size = 10;
    public static int placeSelect;
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
        choice = input.next().charAt(0);
        System.out.println("Choice is" +choice);
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
    public static boolean indexCheck(char[] board, int PlaceSelect) {
        boolean result = (board[PlaceSelect] == ' ');
        System.out.println("Result of boolean check is: " +result);
        return result;
    }

    public static void makingMove(char[] board, int PlaceSelect, char Choice) {
        board[PlaceSelect] = Choice;
        printBoard();
    }
    public static void main(String[] args) {
        initGame();
        selection();
        printBoard();

        System.out.println("Select the position where you want to move");
        placeSelect = input.nextInt();
        if (indexCheck(board, placeSelect)) {
            makingMove(board, placeSelect, choice);
        } else {
            System.out.println("Hello computer " + placeSelect + " is not a valid move.");
        }
    }
}