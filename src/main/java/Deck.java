import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    public List<Card> deck = new ArrayList<>();
    private final Random randomizer = new Random();
    private int n = 0;


    public void initDeck() {
        deck.clear();
        for(Card.Rank rank: Card.Rank.values()){ //заполняем колоду всеми картами
            for(Card.Suit suit: Card.Suit.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return (ArrayList<Card>) deck;
    }

    public Card dealCard() throws RuntimeException {//возвращает случайную карту из колоды и удаляет её в самой колоде
        if(n == 0) {
            initDeck();
            n++;
        }
        if(deck.size() > 0) {
            int number = randomizer.nextInt(deck.size());
            return deck.remove(number);
        }
        throw new RuntimeException("Deck is empty!");
    }
}
