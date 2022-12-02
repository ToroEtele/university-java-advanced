import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Corn extends PizzaIngredient{
    private BufferedImage img;

    public Corn (Pizza pizza) {
        super(pizza);
        try {
            img = ImageIO.read(new File("img/corn.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bake(Graphics g) {
        super.bake(g);
        addCorn(g);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 3;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", corn";
    }

    private void addCorn(Graphics g){
        g.drawImage(img, 250, 180, null);
    }
}
