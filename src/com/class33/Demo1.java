package com.class33;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\yoviq\\IdeaProjects\\Java Batch 9\\Files\\UserData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path); //fileinputstream linked path
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);//fileinput stream,we have access
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row2=sheet.getRow(0);
    }
}
