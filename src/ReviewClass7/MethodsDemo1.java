package ReviewClass7;

public class MethodsDemo1 {

    public static void method1(){  //public can access any package
        System.out.println("Method 1");
    }
    //You cannot access another project with public


    static void method2(){   //will print out in another class by default
        System.out.println("Method 2");  //no need to create an object because of static
    }

    protected static void method3(){
        System.out.println("Method 3");  //Protected can be accessed in another class
        //but not in another package unless you inherit with extends
    }

    private static void method4(){  //not accessible in other class/project
        System.out.println("Method 4");  //will get error
    }


    protected void method5(){  //will print out but need to create an object, since no static keyword
        System.out.println("Method 5");
    }



}
