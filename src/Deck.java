import java.util.Random;

public class Deck extends Player {

    Random random = new Random();

    public Deck() {

    }

    public void createDeck() {

        for (Suits suit : Suits.values()) {
            for (Value value : Value.values()) {
                Card card = new Card(suit, value);
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            int randomIndex = random.nextInt(i);
            Card randomCard = cards.get(randomIndex);
            Card otherRandomCard = cards.get(i);

            // TODO switch cards


        }
    }

    public void printDeck(){

    }

}
