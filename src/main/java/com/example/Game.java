package com.example;

import java.util.Arrays;
import java.util.List;

import java.lang.IllegalArgumentException;

public class Game {

    public Game(){
        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
    }
    public boolean isValidInput(String input){
        String[] values = new String[]{"rock", "paper", "scissors"};
        List<String> list = Arrays.asList(values);

        if(list.contains(input)){
            return true;
        }
        else return false;
    }
    public String Rock_Paper_Scissors(String player1, String player2) throws IllegalArgumentException  {

        String result = null;

        if(isValidInput(player1) && isValidInput(player2)){
            // Player 1 win, Player 2 win, Draw
            if(player1.equals(player2)){
                result = "Draw";
            }
            else if ((player1.equals("rock") && player2.equals("scissors"))||
                    (player1.equals("scissors") && player2.equals("paper"))||
                    (player1.equals("paper") && player2.equals("rock"))) {
                result = "Player 1 win!";
            }
            else if ((player2.equals("rock") && player1.equals("scissors"))||
                    (player2.equals("scissors") && player1.equals("paper"))||
                    (player2.equals("paper") && player1.equals("rock"))) {
                result = "Player 2 win!";
            }
        } else {
            throw new IllegalArgumentException("Illegal Input");
        }
        return result;
    }

}