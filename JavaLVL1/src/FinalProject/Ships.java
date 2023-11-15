package FinalProject;

public enum Ships {
    EMPTY(" 0 ", 0), SHIPS_1DECK(" K ", 1), SHIPS_2DECK(" K ", 2), SHIPS_3DECK(" K ", 3),
    SHIPS_4DECK(" K ", 4), OREOL(" o ", 0), SOS(" s ", 0), MISSED("#", 0), HIT(" X ", 0);

    private String value;
    private int deck;

    Ships(String value, int deck) {
        this.value = value;
        this.deck = deck;
    }

    public String getValue() {
        return value;
    }

    public int getDeck() {
        return deck;
    }

    @Override
    public String toString() {
        return value;
    }
}
