package GroupProject;

public class Car{

    /* #3 Create a Class Car that would have the following fields:
    carPrice() & color & method calculateSalePrice() which should be returning a price of the car
    Create 2 subclasses: Sedan & Truck. The truck class has field as weight & has its own implementation of calculateSalePrice() method
    in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The sedan class has field as length and has its own implementation of calculateSalePrice().
    If length of sedan is >20 feet then returned car price should include 5% discount
    otherwise 10% discount.
     */
        double carPrice;
        String color;
        double discount;

        double calculateSalePrice(double carPrice, String color){
           this.color=color;
           this.carPrice=carPrice;
            return carPrice;
        }
    }
    class Truck extends Car {

    double weight;
    double calculateSalePrice(String color,double carPrice, double weight) {
        this.weight = weight;
        if (weight > 2000) {
            discount= carPrice *0.10;
            System.out.println(color+" truck weighs more than "+weight+"lbs and costs $"+(carPrice-discount)+" with 10% off original truck price of $" +carPrice);
        } else {
            discount= carPrice *0.20;
            System.out.println(color+" truck weighs less than "+weight+"lbs and costs $"+(carPrice-discount)+" with 20% off original truck price of $"+carPrice);
        }
        return carPrice-discount;
    }
}
    class Sedan extends Car {
        double length;
        double calculateSalePrice(double carPrice, double length) {
            this.length = length;
            if (length > 20) {
                discount=carPrice*0.05;
            } else {
                discount=carPrice*0.10;
            }
            return carPrice-discount;
        }
    }
