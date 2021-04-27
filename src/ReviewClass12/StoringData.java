package ReviewClass12;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StoringData {
    public static void main(String[] args) throws IOException {


        String path=System.getProperty("user.dir")+"/Files/userData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fileInputStream);
        Sheet sheet=excel.getSheet("EmpData");

        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();//will return # of rows that contain ONLY DATA

        List<Person> list=new ArrayList<>();

        for (int i = 1; i <physicalNumberOfRows ; i++) {
            Row row = sheet.getRow(i);

            Person person = new Person();
            person.setFirstName(row.getCell(0).toString());
            person.setLastName(row.getCell(1).toString());
            person.setAge((int)row.getCell(2).getNumericCellValue());
            list.add(person);

        }
        System.out.println(list);

    }
}
