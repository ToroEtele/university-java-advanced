package core;

public class Car implements Vehicle{
    private String type;
    private int age;

    public Car(String type, int age) {
        super();
        this.type=type;
        this.age=age;
    }

    @Override
    public void numberOfWheels() {
        System.out.println("Az autonak 4 kereke van");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
