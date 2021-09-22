package com.bridgelabz;

public class SnakeAndLadder {
      public static  int player = 0;
    public static void main(String[] args) {

       int check = (int)Math.floor(Math.random() * 10) % 3;
        int turn = (int)Math.floor(Math.random() * 6) + 1;
        switch (check){
            case 1:
                System.out.println("ladder");
                System.out.println("die value: "+turn);
                player += turn;
                System.out.println("player is in position: " + player);
                break;
            case 2:
                System.out.println("Snake");
                System.out.println("die value: "+turn);
                System.out.println("player is in position: " + player);
                player += turn;
                break;
            case 3:
                System.out.println("No play");
                System.out.println(turn);
                System.out.println("player is in position: " + player);
                break;
            default:
                System.out.println("something Happen sorry !!");
        }

    }
}