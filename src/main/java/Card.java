public class Card {
    public final Suit suit; //масть
    public final Rank rank; //достоинство

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public enum Rank {
        Two("2", 2), Three("3", 3), Four("4", 4), Five("5", 5), Six("6", 6), Seven("7", 7), Eight("8", 8),
        Nine("9", 9), Ten("10", 10), Jack("J", 11), Queen("Q", 12), King("K", 13), Ace("A", 14);

        public final String name;
        public final int value;

        Rank(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    public enum Suit {
        Hearts('♥'), Clubs('♣'), Spades('♠'), Diamonds('♦');

        public final char symbol;

        Suit(char symbol){
            this.symbol = symbol;
        }
    }

    @Override
    public String toString() {
        return String.format("%s%s", rank.name, suit.symbol);
    }
}
