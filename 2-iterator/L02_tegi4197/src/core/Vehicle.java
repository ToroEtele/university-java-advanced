package core;

public class Vehicle {
    protected String type;
    protected int age;

    public Vehicle( String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
