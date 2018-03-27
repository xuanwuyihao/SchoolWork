package com.yh.poi;

import com.yh.bean.Contact;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactReader {

    public static void readXls() throws IOException {
        Workbook workbook=new XSSFWorkbook(new FileInputStream("src/main/resources/contact.xlsx"));
        Sheet sheet=workbook.getSheet("sheet1");
        List<Contact> list=new ArrayList<Contact>();
        for (int row=1, lastRowNum=sheet.getLastRowNum();row <= lastRowNum;row++){
            Row rowDta=sheet.getRow(row);
            Contact contact=new Contact();
            for (int col=0;col<5;col++){
                Cell cell=rowDta.getCell(col);
                if (col==0){
                    contact.setId((int)cell.getNumericCellValue());
                }else if (col==1){
                    contact.setName(cell.getStringCellValue());
                }else if(col==2){
                    contact.setPhone(cell.getStringCellValue());
                }else if (col==3){
                    contact.setSex(cell.getStringCellValue());
                }else if(col==4){
                    contact.setBirthday(cell.getDateCellValue());
                }
                list.add(contact);
            }
            System.out.println(contact);
        }
            workbook.close();
    }

    public static void main(String[] args) throws IOException {
        ContactReader contactReader=new ContactReader();
        contactReader.readXls();
    }

}
