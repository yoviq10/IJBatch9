package GroupProject;

public class CarTester {
    public static void main(String[] args) {

        Truck truck=new Truck();
        System.out.println(truck.calculateSalePrice("Red", 1000,3000));

        Sedan sedan=new Sedan();
        System.out.println(sedan.calculateSalePrice(4000,35));


    }
}
