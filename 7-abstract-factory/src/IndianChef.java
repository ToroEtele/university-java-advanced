public class IndianChef implements Chef{
    public Soup prepareSoup(){
        return new AlmondSoup();
    }

    public MainDish prepareMainDish(){
        return new ChickpeaCurry();
    }
}
