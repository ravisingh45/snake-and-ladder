package com.bridgelabz;

public class SnakeAndLadder {
    //CONSTANT
    static int POSITION_OF_PLAYER = 0;
    static int START_POSITION = 0;
    static int END_POSITION = 100;

    public static void main(String[] args) {
        // Play the game till the end position
        while (POSITION_OF_PLAYER != END_POSITION) {
            // Generate random value
            int RANDOM_DIE_VALUE = (int) (Math.random() * 6) + 1;
            int RANDOM_CHECK = (int) (Math.random() * 10) % 3;
            // Check the condition
            switch (RANDOM_CHECK) {
                case 1:
                    System.out.println("Ladder");
                    System.out.println("Dice value: " + RANDOM_DIE_VALUE);
                    POSITION_OF_PLAYER += RANDOM_DIE_VALUE;
                    System.out.println("Player position is: " + POSITION_OF_PLAYER);
                    if (POSITION_OF_PLAYER > END_POSITION) {
                        POSITION_OF_PLAYER = END_POSITION;
                        System.out.println("player Position: " + POSITION_OF_PLAYER);
                        System.out.println("Player Won !!!");
                        break;
                    }

                    System.out.println("player Position: " + POSITION_OF_PLAYER);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Snake");
                    System.out.println("Dice value: " + RANDOM_DIE_VALUE);
                    POSITION_OF_PLAYER -= RANDOM_DIE_VALUE;
                    System.out.println("Player position is: " + POSITION_OF_PLAYER);
                    if (POSITION_OF_PLAYER < START_POSITION) {
                        POSITION_OF_PLAYER = START_POSITION;
                        System.out.println("player Position: " + POSITION_OF_PLAYER);
                    }

                    System.out.println("player Position: " + POSITION_OF_PLAYER);
                    System.out.println("");
                    break;

                case 0:
                    System.out.println("No Play");
                    POSITION_OF_PLAYER = POSITION_OF_PLAYER;
                    System.out.println("Player position is: " + POSITION_OF_PLAYER);
                    System.out.println("");
                    break;

                default:
                    System.out.println("Something Unexpectated Happen !!");

            }

            // Condition check for player position
            if (POSITION_OF_PLAYER < START_POSITION) {
                POSITION_OF_PLAYER = START_POSITION;
            }

        }

    }
}