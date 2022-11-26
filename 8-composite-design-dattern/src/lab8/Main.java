package lab8;

import lab8.composite.Field;
import lab8.composite.Forest;
import lab8.simple.*;

public class Main {

    public static void main(String[] args) {
        Forest forest = new Forest();
        Field field1 = new Field();
        Field field2 = new Field();

        //Add plants to the field 1
        Plant grass = new Grass();
        Plant flower = new Flower();
        field1.add(grass);
        field1.add(flower);
        //Add field 1 to the forest
        forest.add(field1);

        //Add plants to the field 2
        Plant mushroom1 = new Mushroom();
        Plant mushroom2 = new Mushroom();
        field2.add(mushroom1);
        field2.add(mushroom2);
        //Add field 2 to the forest
        forest.add(field2);

        //Add plants to the forest
        Plant pinetree = new PineTree();
        Plant oaktree = new OakTree();
        forest.add(pinetree);
        forest.add(oaktree);

        System.out.println("Az erdo reprezentacioja: " + forest.getRepresentation());
        System.out.println("Az erdo oxigentermelese: " + forest.getOxigenAmountPerYear());
        System.out.println("Az erdo elettartama: " + forest.getLifeTime());

        System.out.println("Mezo1 oxigentermelese: " + field1.getOxigenAmountPerYear());
        System.out.println("Mezo1 elettartama: " + field1.getLifeTime());

        System.out.println("Mezo2 oxigentermelese: " + field2.getOxigenAmountPerYear());
        System.out.println("Mezo2 elettartama: " + field2.getLifeTime());
    }
}
