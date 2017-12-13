import java.util.Scanner;
/**
 * games.
 */
public class Games {


    /**
     * ugh.
     * @param args yes
     */
    public static void main(final String[] args) {
        board Game = new Board;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player 1's Name");
        String player1 = scanner.nextLine();
        System.out.println("Enter Player 2's Name");
        String player2 = scanner.nextLine();
        if (player1.length() >= player2.length()) {
            System.out.println("Player 1 goes first");
            System.out.println("Player 1 choose a space");
            String current = player1;
        } else {
            System.out.println("Player 2 goes first");
            System.out.println("Player 2 choose a space");
            String current = player2;
        }
        String x = player1;
        String o = player2;

        int chosenSpace = scanner.nextInt();
        board[chosenSpace] = current;



    }



}
