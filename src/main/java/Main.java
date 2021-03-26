import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Player 1 choice (rock, paper, or scissors):");
        String p1 = input.nextLine();
        System.out.println("Enter Player 2 choice (rock, paper, or scissors):");
        String p2 = input.nextLine();

        String result = game.Rock_Paper_Scissors(p1, p2);
        System.out.println(result);
    }
}