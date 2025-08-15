public class Main {
    public static void main(String[] args) {

        QualityProcess electronics = new ElectronicsCheck();
        electronics.checkProduct();

        QualityProcess food = new FoodCheck();
        food.checkProduct();

        QualityProcess toy = new ToyCheck();
        toy.checkProduct();
    }
}
