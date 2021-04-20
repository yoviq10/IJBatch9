package ReviewClass11;

public class WrapperDemo {
    public static void main(String[] args) {

        //warpper class

    String number="10";
    Double doubleNumber=Double.parseDouble(number);  //number converting to double
        System.out.println(doubleNumber); //prints out 10.0

        doubleNumber=10.0/0;
        System.out.println(doubleNumber.isInfinite());//prints out true
        System.out.println(Double.MAX_VALUE);//prints out 1.79769313486

        Integer i=10;

        String iString=i.toString(); //implementing String to String
        System.out.println(i.toString()); //converting from integer to String

    }
}
