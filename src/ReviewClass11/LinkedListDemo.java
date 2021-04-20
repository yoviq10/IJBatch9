package ReviewClass11;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>(); //integer object
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(11);
        numbers.add(13);
        numbers.add(110);
        numbers.add(2);

        System.out.println(numbers); //before

        int index=numbers.indexOf(110); //creating
        numbers.remove(index); //removing 110 from list
        System.out.println(numbers); //after


       // numbers.remove(new Integer(110)); //passing the object
        //numbers.remove();
        //System.out.println(numbers);



    }
}
