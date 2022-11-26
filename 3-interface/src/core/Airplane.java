package core;

public class Airplane implements Vehicle{
    private String type;
    private int age;
    private float lenght;

    public Airplane(String type, int age, float lenght) {
        super();
        this.type=type;
        this.age=age;
        this.lenght=lenght;
    }

    @Override
    public void numberOfWheels() {
        System.out.println("A repulonek 3 kereke van");
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", lenght=" + lenght +
                '}';
    }
}
