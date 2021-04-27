package ReviewClass12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReading {

    public static void main(String[] args) throws IOException {



        String path=System.getProperty("user.dir")+"/Files/userData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excel= new XSSFWorkbook(fileInputStream);

        Sheet sheet= excel.getSheet("EmpData"); //"" whatever you named your sheet
        Row row= sheet.getRow(3);
        Cell cell=row.getCell(1);
        System.out.println(cell);





    }
}
