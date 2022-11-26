public class ChineseChef implements Chef{
    public Soup prepareSoup(){
        return new KlangBakKutTehSoup();
    }

    public MainDish prepareMainDish(){
        return new KungPaoChicken();
    }
}
