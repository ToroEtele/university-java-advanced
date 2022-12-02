import javax.swing.*;

public class PizzaPanel extends JPanel{

    public static void main(String[] args) {

        JFrame frame = new JFrame("Pizza");
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setResizable(false);
        panel.setLayout(null);
        frame.add(panel);

        frame.setVisible(true);

        PizzaBase base = new PizzaBase();

        Tomato ingredient1 = new Tomato(base);
        Olive ingredient2 = new Olive(ingredient1);
        Salami ingredient3 = new Salami(ingredient2);
        Corn ingredient4 = new Corn(ingredient3);
        Mushroom ingredient5 = new Mushroom(ingredient4);
        ingredient5.bake(frame.getGraphics());



        System.out.println("Ingredients: " + ingredient5.getIngredients());
        System.out.println("Price: " + ingredient5.getPrice());
    }
}
