import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//Macy Culbertson
// Cardgame where first player to get a run of four wins
// User input added to make the game more interactive
//3/05/26
public class Cardgame {
 
        public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        List<Hand> players = new ArrayList<>();
        int numPlayers = 5;
        Scanner scanner = new Scanner(System.in);

      
        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter Player " + i + "'s name: ");
            String playerName = scanner.nextLine();
            players.add(new Hand(playerName));
        }

        for (int i = 0; i < 7; i++) {
            for (Hand hand : players) {
                hand.addCard(deck.dealCard());
            }
        }

        boolean gameOver = false;
        while (!gameOver) {
            for (Hand currentPlayerHand : players) {
                System.out.println("\n--- " + currentPlayerHand.getName() + "'s turn ---");
                currentPlayerHand.displayHand();
                boolean isPlayingTurn = true;
                while (isPlayingTurn) {
                    System.out.println(currentPlayerHand.getName() + ", do you want another card? (Enter 1 for Yes, 0 for No)");
                    int choice = getUserNumericInput(scanner);

                    if (choice == 1) {
                        System.out.println("Dealing a card to " + currentPlayerHand.getName() + "...");
                        Card newCard = deck.dealCard();
                        if (newCard != null) {
                            currentPlayerHand.addCard(newCard);
                            System.out.println(currentPlayerHand.getName() + " drew the " + newCard);
                            System.out.println(currentPlayerHand.getName() + " Ending turn.");
                        isPlayingTurn = false;


                          
                            if (currentPlayerHand.checkForRun(4)) { 
                                System.out.println("\n " + currentPlayerHand.getName() + " ______ wins with a run of 4! _____");
                                gameOver = true;
                                isPlayingTurn = false; 
                            }
                            
                            
                            if (gameOver) {
                                break;
                            }
                            
                        } else {
                            System.out.println("The deck is empty. Cannot draw more cards.");
                            isPlayingTurn = false;
                        }
                    } else if (choice == 0) {
                        System.out.println(currentPlayerHand.getName() + " chose not to draw. Ending turn.");
                        isPlayingTurn = false;
                    } else {
                        System.out.println("Invalid choice. Please enter 1 or 0.");
                    }
                }
                if (gameOver) {
                    break; 
                }
            }
        }
        scanner.close();
    }

  
    private static int getUserNumericInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1 or 0).");
                scanner.next(); 
            }
        }
    }
}