import java.util.ArrayList;
import java.util.List;

public class Poker {
    
    static class Card {
        public String suit;
        public String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return String.format("(%s%s)",suit,rank);
//            return "Card{" +
//                    "suit='" + suit + '\'' +
//                    ", rank='" + rank + '\'' +
//                    '}';
        }
    }
    
    public static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        return poker;
    }

    public static void main(String[] args) {
        
    }
}
