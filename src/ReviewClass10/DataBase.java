package ReviewClass10;

public abstract class DataBase {
    //Abstraction Review

    //defining the Rules from what we need:
    public abstract void readFromDataBase(String databaseName);
    public abstract void WriteFromDataBase(String databaseName);
    public abstract void modifyFromDataBase(String databaseName);
}
class OracleDatabase extends DataBase{  //to not get errors make class abstract or override implementations

//implementations below:
    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("We are the oracle experts, we have provided the implementation"+
                "reading data from OracleDatabase");
    }

    @Override
    public void WriteFromDataBase(String databaseName) {
        System.out.println("We are the oracle experts, we have provided the implementation"+
                "write data from OracleDatabase");
    }

    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("We are the oracle experts, we have provided the implementation"+
                "modify data from OracleDatabase");
    }
}

class MicrosoftDatabase extends DataBase{


    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("We are the Microsoft experts, we have provided the implementation"+
                "Reading data from OracleDatabase");
    }

    @Override
    public void WriteFromDataBase(String databaseName) {
        System.out.println("We are the Microsoft experts, we have provided the implementation"+
                "write data from OracleDatabase");
    }

    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("We are the Microsoft experts, we have provided the implementation"+
                "modify data from OracleDatabase");
    }
}

abstract class IBMDatabase extends DataBase{  // the other way of doing it

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("We are the IBM experts, we have provided the implementation"+
                "modify data from OracleDatabase");
    }
}