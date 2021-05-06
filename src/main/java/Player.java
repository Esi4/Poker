import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    public JButton jButton;
    public static boolean click = false;
    Deck deck = new Deck();
    private final Card oneCard = deck.dealCard();
    private final Card twoCard = deck.dealCard();
    int pocketMoney = 500;



//    public void hand() {
//        oneCard = deck.dealCard();
//        twoCard = deck.dealCard();
//    }

    public void drawHand(Graphics2D g) {
        Image shirt = new ImageIcon(("texture/deck/rubashka.jpg")).getImage();
        g.drawImage(shirt, 312, 210, 90, 120, null);
        Image imgOneCard = new ImageIcon(("texture/deck/" + oneCard.toString()) + ".jpg").getImage();
        g.drawImage(imgOneCard, 540, 530, 90, 120, null);
        Image imgTwoCard = new ImageIcon(("texture/deck/" + twoCard.toString()) + ".jpg").getImage();
        g.drawImage(imgTwoCard, 590, 530, 90, 120, null);

        g.setColor(Color.PINK);
        Font font = new Font("Arial", Font.PLAIN, 30);
        g.setFont(font);
        g.drawString(String.valueOf("Your Money: " + pocketMoney), 850, 630);

        jButton = new JButton("25");
        jButton.setBounds(0,0,40,60);


    }

    public boolean win() {
        return pocketMoney > 0;
    }


}
