import java.util.ArrayList;
import java.util.Collections;
public class Cardgame {
 
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        
        // Five players, each getting 7 cards
        Hand player1Hand = new Hand("player 1");
        Hand player2Hand = new Hand("player 2");
        Hand player3Hand = new Hand("player 3");
        Hand player4Hand = new Hand("player 4");
        Hand player5Hand = new Hand("player 5");

        ArrayList<Hand> players = new ArrayList<>();
        players.add(player1Hand);
        players.add(player2Hand);
        players.add(player3Hand);
        players.add(player4Hand);
        players.add(player5Hand);
    

        for (int i = 0; i < 7; i++) {
            for (Hand hand : players) {
                hand.addCard(deck.dealCard());
            }
        }

        System.out.println("Player 1's Hand:");
        System.out.println(player1Hand);
        System.out.println("Player 2's Hand:");
        System.out.println(player2Hand);
        System.out.println("Player 3's Hand:");
        System.out.println(player3Hand);
        System.out.println("Player 4's Hand:");
        System.out.println(player4Hand);
        System.out.println("Player 5's Hand:");
        System.out.println(player5Hand);

        Hand winner = determineWinner(players);
        if (winner != null) {
            System.out.println(winner.owner + " is the winner" + " (highest single card):");
            System.out.println();
            System.out.println(winner);
        } else {
            System.out.println("\nNo winner determined.");
        }
    }

    // Determines the winner based on the highest single card in their hand
    public static Hand determineWinner(ArrayList<Hand> players) {
        if (players == null || players.isEmpty()) {
            return null;
        }

        Hand winner = players.get(0); // takes the first card of each hand to decide the winner
        int highestCardValue = 0;
        if (!winner.getCards().isEmpty()) {
            highestCardValue = winner.getCards().get(0).getValue();
        }

        for (int i = 1; i < players.size(); i++) {
            Hand currentPlayerHand = players.get(i);
            if (!currentPlayerHand.getCards().isEmpty()) {
                currentPlayerHand.sortHand();
                int currentCardValue = currentPlayerHand.getCards().get(0).getValue();
                if (currentCardValue > highestCardValue) {
                    winner = currentPlayerHand;
                    highestCardValue = currentCardValue;
                }
            }
        }
        return winner;
    }
}