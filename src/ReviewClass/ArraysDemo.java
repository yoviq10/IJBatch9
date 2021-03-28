package ReviewClass;

public class ArraysDemo {

    public static void main(String[] args) {
    //Why we use variables?
        /*
        We use variables to hold single values

         */

        int num=10;
        String name="Yovanna";
        name="yovi";
        System.out.println(name);
        // limitation of variables is that we can only store a single value at a time
        // if we try to store a new value, previous value is overridden by the latest value
        //To overcome this issue, Java has arrays. In arrays, we can store multiple values
        //using a single array type variable.

        String [] names=new String[10];//recommended approach
        String names2 []=new String[10];//another way declaring an array but not good
        names[0]="Yovanna";
        names[1]="yovi";
        names[2]="yoyo";

        //2 D ARRAYS

        int [][] numbers=new int [10][10];
        numbers [0][0]=12;
        numbers[0][1]=20;

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        // we have 8 PRIMITIVES DATA TYPES

        /*
        byte, short, int, long, char, float, double, boolean,

         */



    }


}
