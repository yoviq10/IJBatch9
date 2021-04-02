package ReviewClass7;

import java.util.Arrays;
import java.util.Scanner;

public class VarDemo {
    int [] arr;
    int sum;
    Scanner scanner;

    VarDemo(int [] arr){
        this.arr=arr;
        scanner=new Scanner(System.in);
    }


    public int getSum(){
        int sum=0;
       for(int number:arr){
           sum+=number;
       }
       return sum;
    }
    public void calculateAverage(){
        System.out.println(getSum()/arr.length);
    }
    public void printMax(){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
    public void printMin(){
        Arrays.sort(arr);
        System.out.println(arr[0]);

    }
}
