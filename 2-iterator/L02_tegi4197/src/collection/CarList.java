package collection;

import core.Car;

public class CarList {
    private int current = 0;
    private Car[] cars;

    public CarList(int size) {
        this.cars = new Car[size];
    }

    public void addCar(Car tmp) {
        try {
            cars[current] = tmp;
            current++;
        } catch ( Exception e) {
            System.out.print("A lista megtelt. Több objektum nem helyezhető a listába.\n");
        }
    }

    public class CarIterator {
        private int index=0;

        public CarIterator(){}

        public boolean hasMoreElements() {
            return (index < current);
        }

        public Car nextElement() {
            if (hasMoreElements()){
                Car answ = cars[index];
                index++;
                return answ;
            }
            return null;
        }
    }

    public CarIterator getIterator() {
        return new CarIterator();
    }
}
