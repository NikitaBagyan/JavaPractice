package Collections.Set;

import java.util.Objects;

public class Cards {

    private final String suit;
    private  String rank;

    public Cards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return suit.equals(cards.suit) && rank.equals(cards.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public String toString(){
        return "Cards{"+ "'Suit '" + suit + "'rank '" + rank + "}";
    }
}
