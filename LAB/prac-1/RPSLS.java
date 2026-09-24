import java.util.Random;
import java.util.Scanner;

public class RPSLS {

    enum Move {
        ROCK, PAPER, SCISSORS, LIZARD, SPOCK
    }

    static int winner(Move a, Move b) {

        if (a == b) {
            return 0;
        }

        if ((a == Move.SCISSORS && (b == Move.PAPER || b == Move.LIZARD)) ||
            (a == Move.PAPER && (b == Move.ROCK || b == Move.SPOCK)) ||
            (a == Move.ROCK && (b == Move.LIZARD || b == Move.SCISSORS)) ||
            (a == Move.LIZARD && (b == Move.SPOCK || b == Move.PAPER)) ||
            (a == Move.SPOCK && (b == Move.SCISSORS || b == Move.ROCK))) {
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter move: ");
            String input = sc.next().toUpperCase();

            Move player = Move.valueOf(input);

            Move computer = Move.values()[random.nextInt(5)];

            System.out.println("You: " + player);
            System.out.println("Computer: " + computer);

            int result = winner(player, computer);

            if (result == 1) {
                System.out.println("You win");
                playerScore++;
            } else if (result == -1) {
                System.out.println("Computer wins");
                computerScore++;
            } else {
                System.out.println("Tie");
            }
        }

        System.out.println("You: " + playerScore);
        System.out.println("Computer: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("Overall Winner: You");
        } else if (computerScore > playerScore) {
            System.out.println("Overall Winner: Computer");
        } else {
            System.out.println("Overall Winner: Tie");
        }

        sc.close();
    }
}