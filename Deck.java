import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Macy Culbertson
// Unit 4 game program
public class Deck {
private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; // Ace high

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }


    public Card dealCard() {
        if (cards.isEmpty()) {
            return null; // Or throw an exception
        }
        return cards.remove(0);
    }
}