package com.tictactoe;

public class TicTacToe {

        public static int size = 10;
        public static char[] board = new char[size];

        public static void initGame() {
        System.out.println();
        for (int index = 1; index < size; ++index) {
            board[index] = ' ';  // all cells empty
            System.out.println("Value of index " + index + " is " + board[index]);
        }
    }
        public static void main(String[] args) {
        initGame();
    }
    }

