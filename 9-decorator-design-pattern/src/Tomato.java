import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tomato extends PizzaIngredient{
    private BufferedImage img;

    public Tomato (Pizza pizza){
        super(pizza);
        try {
            img = ImageIO.read(new File("img/tomato.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bake(Graphics g){
        super.bake(g);
        addTomato(g);

    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", tomato";
    }

    private void addTomato(Graphics g){
        g.drawImage(img, 270, 280, null);
    }
}
