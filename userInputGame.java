import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//Macy Culbertson
// SD class Game Assignment
// 3/5/26
public class userInputGame {
    public static void main(String[] args) {
        
        List<String> players = new ArrayList<>();
        int numPlayers = 5;

        try (Scanner scanner = new Scanner(System.in)) {
            
            for (int i = 1; i <= numPlayers; i++) {
                System.out.print("Enter Player " + i + "'s name: ");
                String playerName = scanner.nextLine();
                players.add(playerName);
            }

          
            for (String player : players) {
                System.out.println("Welcome, " + player + "!");
            }

          
            for (String currentPlayer : players) {
                boolean isPlayingTurn = true; 
                while (isPlayingTurn) {
                    System.out.println(currentPlayer + ", do you want another card? (Enter 1 for Yes, 0 for No)");
                    int choice = getUserNumericInput(scanner);

                    if (choice == 1) {
                        System.out.println("Dealing another card to " + currentPlayer + "...");

                    } else if (choice == 0) {
                        System.out.println(currentPlayer + " chose to not draw. Ending turn.");
                        isPlayingTurn = false; 
                    } else {
                        System.out.println("Invalid choice. Please enter 1 or 0.");
                    }
                }
            }

            System.out.println("All players have finished their turns.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    /**
     * 
     * @param scanner 
     * @return 
     */
    public static int getUserNumericInput(Scanner scanner) {
        while (true) {
            try {
                
                if (scanner.hasNextInt()) {
                    return scanner.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); 
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }
    }
}


