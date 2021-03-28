package ReviewClass;

public class EmployeeTester {

    public static void main(String[] args) {


        Employee emp=new Employee();

        emp.id="123";
        emp.name="Yovi";
        emp.department="IT";
        emp.salary=150000;

        Employee YovannaObj=new Employee();

        YovannaObj.id="12345";
        YovannaObj.name="Yovanna";
        YovannaObj.department="IT";
        YovannaObj.salary=200000;

        Employee[] employees=new Employee[2];
        employees[0]=emp;
        employees[1]=YovannaObj;

        /*
        Using a for Loop, print the values of
        Employee objects and call the methods
         */
        for (int i=0; i< employees.length; i++) {
            System.out.println("emplyee id:" + employees[i].id);
            System.out.println("emplyee name:" + employees[i].name);
            System.out.println("emplyee department:" + employees[i].department);
            System.out.println("emplyee salary:" + employees[i].salary);
            System.out.println();
        }





    }
}
