package ReviewClass12;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingAllTheData {
    public static void main(String[] args) throws IOException {


        String path=System.getProperty("user.dir")+"/Files/userData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("EmpData");

        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();//will return # of rows that contain ONLY DATA

        for (int i = 0; i <physicalNumberOfRows ; i++) {
            Row row=sheet.getRow(i);
            int physicalNumberOfCells = row.getPhysicalNumberOfCells();

            for (int j = 0; j <physicalNumberOfCells ; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}
