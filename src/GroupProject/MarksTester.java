package GroupProject;

public class MarksTester {
    public static void main(String[] args) {

        Marks marks=new A(50,76,80);
        System.out.println(marks.getPercentage());
        Marks marks1=new B(75,67,60,99);
        System.out.println(marks1.getPercentage());
    }
}


