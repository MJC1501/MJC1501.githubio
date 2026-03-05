import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Macy Culbertson
// Unit 4 game program
// Hand class that makes sure if a player gets a run of cards
public class Hand {
  private final String name;
    private final List<Card> cards;

    public Hand(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (card != null) {
            cards.add(card);
            Collections.sort((List<Card>) cards); 
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public String getName() {
        return name;
    }

    public boolean checkForRun(int runLength) {
        if (cards.size() < runLength) {
            return false;
        }

       
        int consecutiveCount = 1;
        for (int i = 0; i < cards.size() - 1; i++) {
           
            if (cards.get(i+1).getRank() == cards.get(i).getRank() + 1) {
                consecutiveCount++;
                if (consecutiveCount >= runLength) {
                    return true;
                }
            } else if (cards.get(i+1).getRank() != cards.get(i).getRank()) {
                consecutiveCount = 1; 
            }
           
        }
        return false;
    }
    
   
    public void displayHand() {
        System.out.println(name + "'s hand:");
        for (Card card : cards) {
            System.out.println("  " + card);
        }
    }
}