import java.util.ArrayList;
import java.util.List;

// Macy Culbertson
// Unit 4 game program
// Hand class that makes sure 
public class Hand {
 private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        if (cards.isEmpty()) {
            return "Empty Hand";
        }
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }
}