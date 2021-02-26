public enum Suits {
    HEARTS("Hearts"),
    SPADES("Spades"),
    CLUBS("Diamonds"),
    DIAMONDS("Clubs");

    private final String suitString;

    private Suits(String suitString) {
        this.suitString = suitString;
    }

    public String printSuit(){
        return suitString;
    }
}
