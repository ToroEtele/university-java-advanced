import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCircleFrame extends JFrame implements ActionListener {
    private MovePanel panel = new MovePanel();
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JButton button4 = new JButton();

    public MoveCircleFrame(){
        setTitle("Move Circle Frame");
        setBounds(100, 260, 500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(panel, BorderLayout.CENTER);

        button1.setText("^");
        button2.setText(">");
        button3.setText("v");
        button4.setText("<");

        button1.setBackground(Color.lightGray);
        button2.setBackground(Color.lightGray);
        button3.setBackground(Color.lightGray);
        button4.setBackground(Color.lightGray);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.EAST);
        add(button3, BorderLayout.SOUTH);
        add(button4, BorderLayout.WEST);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(button1) && panel.posY > 0) {
            panel.posY = panel.posY - 5;
            repaint();
        }
        if (obj.equals(button2) && panel.posX < 340) {
            panel.posX = panel.posX + 5;
            repaint();
        }
        if (obj.equals(button3) && panel.posY < 350) {
            panel.posY = panel.posY + 5;
            repaint();
        }
        if (obj.equals(button4) && panel.posX > 0) {
            panel.posX = panel.posX - 5;
            repaint();
        }
    }
}
