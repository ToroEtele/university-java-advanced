import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class DateFrame extends JFrame implements ActionListener {
    private JLabel label = new JLabel();
    private JButton button = new JButton("Click me");

    public DateFrame() {
        setBounds(100, 50, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setLayout(new FlowLayout());
        setTitle("Date Frame");
        label.setText("Hello");
        add(label);
        button.setBackground(Color.lightGray);
        add(button);

        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((e.getSource()).equals(button)) {
            label.setText(String.valueOf(LocalDateTime.now()));
        }
    }
}
