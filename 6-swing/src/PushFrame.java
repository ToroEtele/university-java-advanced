import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class PushFrame extends JFrame implements MouseListener {
    private JButton button = new JButton("Push Me!");
    Random x = new Random();

    public PushFrame () {
        setTitle("Push Frame");
        setBounds(600, 50, 350, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setMinimumSize(new Dimension(300, 300));

        button.setSize(100,30);
        button.setLocation(x.nextInt(this.getWidth()-100), x.nextInt(this.getHeight()-100));
        button.addMouseListener(this);

        add(button);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if ((e.getSource()).equals(button)) {
            int ranX = x.nextInt(this.getWidth()-100);
            int ranY = x.nextInt(this.getHeight()-100);

            if(!MouseInfo.getPointerInfo().getLocation().equals(new Point(ranX, ranY))) {
                button.setLocation(ranX, ranY);
            } else {
                ranX = x.nextInt(this.getWidth()-100);
                ranY = x.nextInt(this.getHeight()-100);
                button.setLocation(ranX, ranY);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
