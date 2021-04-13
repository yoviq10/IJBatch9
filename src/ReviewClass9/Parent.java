package ReviewClass9;

public class Parent {

    double PI=3.14;

    double calculateArea(double length, double width){
        return length*width;
    }
}

class Child extends Parent {

    double area(double height, double width, double length){
        return height*width*length;
    }

    double calculateArea(double radius){
        return super.PI*radius*radius;
    }


}