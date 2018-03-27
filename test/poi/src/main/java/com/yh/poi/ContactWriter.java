package com.yh.poi;

import com.yh.bean.Contact;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContactWriter {

    public static void main(String[] args) throws IOException {
        List<Contact> contactList = new ArrayList<Contact>();
        contactList.add(new Contact(1, "张三", "13666666666", "女", Calendar.getInstance().getTime()));
        writeExcel("src/main/resources/c.xlsx", contactList);
    }

    public static void writeExcel(String file, List<Contact> contactList) throws IOException {
        if (file != null && file.endsWith(".xlsx")) {
            writeExcel(file, ".xlsx", contactList);
        } else if (file != null && file.endsWith(".xls")) {
            writeExcel(file, ".xls", contactList);
        }
    }

    public static void writeExcel(String file, String ext, List<Contact> contactList) throws IOException {
        Workbook workbook = null;
        if (".xls".equalsIgnoreCase(ext)) {
            workbook = new HSSFWorkbook();
        } else if (".xlsx".equalsIgnoreCase(ext)) {
            workbook = new XSSFWorkbook();
        }
        if (workbook != null) {
            Sheet sheet = workbook.createSheet("Sheet1");
            for (int row = 0, totalRow = contactList.size(); row < totalRow; row++) {
                Row rowData = sheet.createRow(row);
                Contact contact = contactList.get(row);
                for (int col = 0; col < 5; col++) {
                    Cell cell = rowData.createCell(col);
                    if (col == 0) {
                        cell.setCellValue(contact.getId());
                    } else if (col == 1) {
                        cell.setCellValue(contact.getName());
                    } else if (col == 2) {
                        cell.setCellValue(contact.getPhone());
                    } else if (col == 3) {
                        cell.setCellValue(contact.getSex());
                    } else if (col == 4) {
                        cell.setCellValue(contact.getBirthday());
                    }
                }
            }
            workbook.write(new FileOutputStream(file));
            workbook.close();
        }
    }

}
