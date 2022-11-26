public class KlangBakKutTehSoup implements Soup {

    public void associateMainDish(MainDish mainDish) {
        System.out.println("A " + this + " leveshez a " + mainDish+" foetelt tarsitottam");
    }

    public String toString() {
        return getClass().getSimpleName();
    }

}
