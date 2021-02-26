
public class Card {

    private Suits suit;
    private Value value;

    public Card(Suits suit, Value value) {
        this.suit = suit;
        this.value = value;
    }


    public Value getValue() {
        return value;
    }

    public Suits getSuit() {
        return suit;
    }

}
