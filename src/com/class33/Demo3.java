package com.class33;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo3 {

    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\yoviq\\IdeaProjects\\Java Batch 9\\Files\\UserData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        Map<String,String> rows=new HashMap<>();
        int numofRows=sheet.getPhysicalNumberOfRows();

      // ArrayList<Map<String,String>> arrayList=new ArrayList<>();
        for (int i = 0; i <numofRows ; i++) {
          //  HashMap<String,String>map=new HashMap<>();
            Row row=sheet.getRow(i);
            String firstName=row.getCell(0).toString();
            String lastName=row.getCell(1).toString();
            String gender=row.getCell(2).toString();
          System.out.println(firstName+" "+lastName+" "+gender);

         /*  map.put("firstName",firstName);
           map.put("lastName", lastName);
           map.put("gender",gender);
           arrayList.add(map);
*/
        }
        //System.out.println(arrayList);
    }
}
