package collection;

import core.Car;

public class MyHashMap {
    private Entry[] entries;

    public MyHashMap(Integer size) {
        entries = new Entry[size];
    }

    public void put(Integer key, Car value){
        if(!containsKey(key) && (key > 999 || key < 10000)){
            int hashKey = hashFunction(key); //kiszámolom az alvázszám hash értékét
            Entry e = new Entry(key, value, entries[hashKey]); //létrehozom az új entryt, mely az adott hashű lancolt lista utolsó elemére mutat.
            entries[hashKey] = e; //beteszem az adott heshű lista elejére a az entry tömbben
        }
        else{
            System.out.println("Ez a kulcs mar letezik vagy nem negyjegyu szam.");
        }
    }

    public Car get(Integer key) {
        Entry e = entries[hashFunction(key)];
        while (e!=null) {
            if(e.getKey().equals(key)) {
                return e.getValue();
            } else {
                e = e.getNext();
            }
        }
        return null;
    }

    public Boolean containsKey(Integer key){
        Car e = get(key);
        if (e==null){
            return false;
        }else{
            return true;
        }

    }

    private int hashFunction(Integer key){
        return key % entries.length;
    }
}
