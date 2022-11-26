public class Menu {
    private Soup leves;
    private MainDish foetel;

    public void createMenu(Chef chef){
        leves = chef.prepareSoup();
        foetel = chef.prepareMainDish();
        leves.associateMainDish(foetel);
    }

    public static void main(String[] args){
        Menu chinese = new Menu();
        chinese.createMenu(new ChineseChef());
        Menu indian = new Menu();
        indian.createMenu(new IndianChef());
    }
}
