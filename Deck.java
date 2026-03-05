import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Macy Culbertson
// Unit 4 game program
public class Deck {
  private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            return null; // Handle empty deck
        }
        return cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}