package lab8.composite;

import lab8.Plant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Field implements Plant {
    private Set<Plant> field;


    public Field(){
        field = new HashSet<Plant>();
    }

    public void add(Plant plant){
        field.add(plant);
    }

    public void remove(Plant plant){
        field.remove(plant);
    }

    //Sum of the produced oxygen amount
    @Override
    public double getOxigenAmountPerYear() {
        Iterator<Plant> it = field.iterator();
        double O = 0;
        while(it.hasNext()){
            O += it.next().getOxigenAmountPerYear();
        }
        return O;
    }

    //Maximum Lifetime
    @Override
    public int getLifeTime() {
        Iterator<Plant> it = field.iterator();
        int maxl = 0;
        while(it.hasNext()){
            if(it.next().getLifeTime() > maxl)
                maxl += it.next().getLifeTime();
        }
        return maxl;
    }

    @Override
    public String getRepresentation() {
        Iterator<Plant> it = field.iterator();
        StringBuilder str = new StringBuilder();
        str.append("[");

        while(it.hasNext()){
            str.append(it.next().getRepresentation());
            str.append(",");
        }
        str.deleteCharAt(str.length()-1);
        str.append("]");

        return str.toString();
    }

}
