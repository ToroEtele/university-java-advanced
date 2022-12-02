import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mushroom extends PizzaIngredient {
    private BufferedImage img;

    public Mushroom (Pizza pizza){
        super(pizza);
        try {
            img = ImageIO.read(new File("img/mushroom.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bake(Graphics g) {
        super.bake(g);
        addMushroom(g);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", mushroom";
    }

    private void addMushroom(Graphics g){
        g.drawImage(img, 192, 292, null);
    }
}
