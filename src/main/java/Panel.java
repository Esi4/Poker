import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;


public class Panel extends JPanel implements ActionListener {
    public static int high = Toolkit.getDefaultToolkit().getScreenSize().height; //высота панели
    public static int width = Toolkit.getDefaultToolkit().getScreenSize().width; //ширина панели

    public static int mouseX; //координаты панели
    public static int mouseY;

    public enum states{menus, play}
    public static states state = states.menus; //изначальная переменная

    private BufferedImage image; //ссылка на объект класса
    private Graphics2D g;
    private int n = 0;

    Timer timer = new Timer(30, this); //задается интервал обновления игровых событий

    Background bkg = new Background();
    Menu menus = new Menu();
    Deck deck = new Deck();
    Player player = new Player();
    Field field = new Field();


    public Panel() {
        super();
        setFocusable(true);
        requestFocus();
        timer.start(); //старт таймера
        image = new BufferedImage(width, high, BufferedImage.TYPE_INT_BGR); //объект буффера для картинок
        g = (Graphics2D) image.getGraphics();

        addMouseListener (new Mouse());
        addMouseMotionListener (new Mouse());
        addKeyListener(new Mouse());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (state.equals(states.menus)) {
            bkg.draw(g);
            menus.draw(g);
            if (Panel.mouseX > 472 && Panel.mouseX < 700 && Panel.mouseY > 30 && Panel.mouseY < 64) {
                if(Menu.click) {//клик ЛКМ для начала игры
                    state = states.play;
                    Menu.click = false;
                }
            }
            if(Panel.mouseX > 500 && Panel.mouseX < 630 && Panel.mouseY > 420 && Panel.mouseY < 460) {
                if(Menu.click) {
                    System.exit(0);
                }
            }
            gameDraw();
        }
        if (state.equals(states.play)) {
            field.initialField();
            bkg.draw(g);
            field.drawField(g);
            player.drawHand(g);
            //add(player.jButton);
            gameDraw();
        }
    }


    private void gameDraw() {
        Graphics g2 = this.getGraphics();
        g2.drawImage(image, 0,0, null);
        g2.dispose();

        Point location = MouseInfo.getPointerInfo().getLocation();
        double x = location.getX();
        double y = location.getY();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
