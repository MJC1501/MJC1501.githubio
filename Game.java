import java.util.ArrayList;
import java.util.Collections;
public class Game {


    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        
        
        Hand player1Hand = new Hand("player 1");
        Hand player2Hand = new Hand("player 2");
        Hand player3Hand = new Hand("player 3");
        Hand player4Hand = new Hand("player 4");
      

        ArrayList<Hand> players = new ArrayList<>();
        players.add(player1Hand);
        players.add(player2Hand);
        players.add(player3Hand);
        players.add(player4Hand);
        

        for (int i = 0; i < 13; i++) {
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
       
}
}