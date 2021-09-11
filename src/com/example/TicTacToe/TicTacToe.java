package com.example.TicTacToe;

import javafx.scene.transform.Scale;

import java.util.Scanner;
public class compute{
    static void ChooseLetter() {

        System.out.println("Which letter you want to choose");
        String turn ="X";
        if(turn.equals("X")){
            turn = "o";
        }
        else
            turn = "X";
    }
}
public class TicTacToe {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String[] board = new String[10];
        String turn = "x";
        String winner=null;

    }
}
