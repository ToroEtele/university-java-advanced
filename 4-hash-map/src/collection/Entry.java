package collection;

import core.Car;

public class Entry {
    private Integer key;    //alvázszám
    private Car value;  //az autó
    private Entry next; //referencia a következőre

    public Entry(int key, Car value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Integer getKey() {
        return key;
    }

    public Car getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }
}
