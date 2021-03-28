package ReviewClass6;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("hello");

      //  stringBuilder.append(" Batch 9 ").delete(0,5); //append is used to add
      //  stringBuilder.append(" Batch 9 ").deleteCharAt(0);
      //  stringBuilder.append(" Batch 9 ").insert(12,"bye");
        stringBuilder.append(" Hello how are you?");
        stringBuilder.insert(stringBuilder.indexOf("you")+4,"bye");
        System.out.println(stringBuilder.indexOf("you"));


        System.out.println(stringBuilder);


    }






}
