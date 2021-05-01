package com.class33;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\yoviq\\IdeaProjects\\Java Batch 9\\Files\\UserData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        Map<String,String> rows=new HashMap<>();
       int numofRowsInASheet=sheet.getPhysicalNumberOfRows();
       // System.out.println(numofRowsInASheet);

        for (int i = 0; i <numofRowsInASheet ; i++) {
            Row row=sheet.getRow(i);
        int numofCells= row.getPhysicalNumberOfCells(); //will return the count of actual cells that contain the data
        //    System.out.println(numofCells);
            for (int j = 0; j <numofCells ; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }



    }
}
