package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player = 1;
        int turn = (int)Math.floor(Math.random() * 10) % 6;
        System.out.println("**************** Welcome to the Snake and ladder game****************");
        System.out.println("Your player is at: "+turn+" position at the board");

    }
}