// Macy Culbertson
// Unit 4 game program updated
public class Card implements Comparable<Card> {
  public static final int CLUB = 0;
    public static final int DIAMOND = 1;
    public static final int HEART = 2;
    public static final int SPADE = 3;

    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private final int suit;
    private final int rank;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        String suitStr;
        switch (suit) {
            case CLUB: suitStr = "Clubs"; break;
            case DIAMOND: suitStr = "Diamonds"; break;
            case HEART: suitStr = "Hearts"; break;
            case SPADE: suitStr = "Spades"; break;
            default: suitStr = "Unknown";
        }

        String rankStr;
        switch (rank) {
            case ACE: rankStr = "Ace"; break;
            case TWO: rankStr = "Two"; break;
           
            case TEN: rankStr = "Ten"; break;
            case JACK: rankStr = "Jack"; break;
            case QUEEN: rankStr = "Queen"; break;
            case KING: rankStr = "King"; break;
            default: rankStr = String.valueOf(rank);
        }

        return rankStr + " of " + suitStr;
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rank, other.rank);
    }
}