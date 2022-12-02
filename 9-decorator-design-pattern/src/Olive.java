import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Olive extends PizzaIngredient {
    private BufferedImage img;

    public Olive (Pizza pizza){
        super(pizza);
        try {
            img = ImageIO.read(new File("img/olive.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bake(Graphics g) {
        super.bake(g);
        addOlive(g);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", olive";
    }

    private void addOlive(Graphics g){
        g.drawImage(img, 185, 225, null);
    }
}
