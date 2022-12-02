import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Salami extends PizzaIngredient{
    private BufferedImage img;

    public Salami (Pizza pizza) {
        super(pizza);
        try {
            img = ImageIO.read(new File("img/salami.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bake(Graphics g) {
        super.bake(g);
        addSalami(g);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", salami";
    }

    private void addSalami(Graphics g){
        g.drawImage(img, 150, 160, null);
    }
}
