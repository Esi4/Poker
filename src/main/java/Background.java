import javax.swing.*;
import java.awt.*;

public class Background {
    Image imgMenus = new ImageIcon ("texture/fonMenu.jpg").getImage(); //загрузка картинки
   // Image imgPlay = new ImageIcon("image/play.png").getImage(); //загрузка картинки

    public void draw(Graphics2D g) {

        if (Panel.state.equals(Panel.states.menus)) {
            g.drawImage(imgMenus,0,0, null);
        }
        if (Panel.state.equals(Panel.states.play)) {
           g.drawImage(imgMenus,0,0, null);
        }
    }
}
