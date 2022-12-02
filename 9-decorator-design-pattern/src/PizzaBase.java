import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PizzaBase implements Pizza{
    private BufferedImage img;

    @Override
    public void bake(Graphics g) {
        try {
            img = ImageIO.read(new File("img/base.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(img, 100, 100, null);
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getIngredients() {
        return "Napolitan Pizza Base";
    }
}