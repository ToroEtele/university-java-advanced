package collection;
import core.Vehicle;

public class VehicleList {
    private int current = 0;
    private Vehicle[] vehicles;

    public VehicleList(int size){
        vehicles = new Vehicle[size];
    }

    public void addVehicle(Vehicle vehicle){
        vehicles[current] = vehicle;
        current++;
    }

    public VehicleIterator getForwardIterator(){
        return new VehicleForwardIterator();
    }

    public VehicleIterator getBackwardIterator(){
        return new VehicleBackwardIterator();
    }

    public class VehicleForwardIterator implements VehicleIterator{
        private int index;

        public VehicleForwardIterator(){
            index = 0;
        }

        public boolean hasMoreElements(){
            return index < current;
        }

        public Vehicle nextElement(){
            index++;
            return vehicles[index-1];
        }
    }

    public class VehicleBackwardIterator implements VehicleIterator{
        private int index;

        public VehicleBackwardIterator(){
            index = vehicles.length-1;
        }

        public boolean hasMoreElements(){
            return index >= 0;
        }

        public Vehicle nextElement(){
            index--;
            return vehicles[index+1];
        }
    }
}
