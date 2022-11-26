package lab8.composite;

import lab8.Plant;

import java.util.ArrayList;

public class Forest implements Plant{
    private ArrayList<Plant> forest;

    public Forest(){
        forest = new ArrayList<Plant>();
    }

    public void add(Plant plant){
        forest.add(plant);
    }

    public void remove(Plant plant){
        forest.remove(plant);
    }

    //Sum of the produced oxygen amount
    @Override
    public double getOxigenAmountPerYear() {
        double O = 0;
        for(Plant p : forest){
            O += p.getOxigenAmountPerYear();
        }
        return O;
    }

    //Maximum Lifetime
    @Override
    public int getLifeTime() {
        int maxl = 0;
        for(Plant p : forest){
            if(p.getLifeTime() > maxl)
                maxl += p.getLifeTime();
        }
        return maxl;
    }

    @Override
    public String getRepresentation() {
        StringBuilder str = new StringBuilder();
        str.append("{");

        for(Plant p : forest){
            str.append(p.getRepresentation());
            str.append(",");
        }
        str.deleteCharAt(str.length()-1);
        str.append("}");

        return str.toString();
    }
}
