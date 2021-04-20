package ReviewClass11;

import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {


        TreeSet<Integer> treeSet=new TreeSet<>(); //in numerically order
        treeSet.add(10);
        treeSet.add(120);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(155);
        System.out.println(treeSet); //prints 10,30,50,100,120,155

    }
}
