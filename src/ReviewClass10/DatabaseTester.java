package ReviewClass10;

public class DatabaseTester {
    public static void main(String[] args) {

    DataBase dataBase= new MicrosoftDatabase();
    dataBase.readFromDataBase("Database1");
    dataBase.WriteFromDataBase("Database1");
    dataBase.modifyFromDataBase("Database1");

    // DataBase dataBase1=new DataBase();CE, cannot create new object from abstract class




    }
}
