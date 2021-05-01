package com.class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Demo5 {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\yoviq\\IdeaProjects\\Java Batch 9\\Files\\UserData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        int numofRowsinSheet=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i <numofRowsinSheet; i++) {

            Row row=sheet.getRow(i); //getting all of rows
            if(i==0){
              Cell cell= row.createCell(3); //creating a cell in index#3
                cell.setCellValue("Salary");
            }else{
                Cell cell= row.createCell(3);
                cell.setCellValue(150000);
              // Random random=new Random(); //helps us generate random numbers
             //   cell.setCellValue(random.nextInt(150000));  //random numbers under 150,000
            }
        }

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);



    }
}
