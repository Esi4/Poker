import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Field extends Deck{
    private final List<Card> deckField = new ArrayList<>();
    private final int n = 3;
    private int x = 0;

    public void initialField() {
        if(x == 0) {
            for (int i = 0; i < 5; i++) {
                deckField.add(i, dealCard());
                x++;
            }
        }
    }

    public void drawField(Graphics2D g) {
        for (int i = 0; i < n; i++) {
            Image imgOneCard = new ImageIcon(("texture/deck/" + deckField.get(i).toString()) + ".jpg").getImage();
            g.drawImage(imgOneCard, 412 + (i * 100), 210, 90, 120, null);
        }
    }
}
