import javax.swing.*;
import java.awt.*;

public class MovePanel extends JPanel {
    public int a = 60;
    public int b = 60;
    public int posX = 200 - a/2;
    public int posY = 200 - b/2;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(posX, posY, a, b);
    }
}
