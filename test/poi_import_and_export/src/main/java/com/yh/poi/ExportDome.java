package com.yh.poi;

import com.yh.bean.Contact;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class ExportDome {

    public static void main(String[] args) throws Exception {
        List<Contact> contactList = new ArrayList<Contact>();


        contactList.add(new Contact(1,"逸浩","男","999999999999",Calendar.getInstance().getTime()));
        System.out.println("pppp"+contactList);
        writeExcel("src/main/resources/c.xlsx", contactList);
    }

    public static void writeExcel(String file, List<Contact> contactList) throws Exception {
        if (file != null && file.endsWith(".xlsx")) {
            writeExcel(file, ".xlsx", contactList);
        } else if (file != null && file.endsWith(".xls")) {
            writeExcel(file, ".xls", contactList);
        }
    }



    public static void writeExcel(String file, String ext, List<Contact> contactList) throws Exception {
        Workbook workbook = null;
        if (".xls".equalsIgnoreCase(ext)) {
            workbook = new HSSFWorkbook();
        } else if (".xlsx".equalsIgnoreCase(ext)) {
            workbook = new XSSFWorkbook();
        }

        if (workbook != null) {

            Sheet sheet = workbook.createSheet("Sheet1");
            sheet.setColumnWidth(3, 5000);
            sheet.setColumnWidth(5, 5000);
            writeTitle(sheet, "公司员工资料");
            System.out.println("--------");
            writeHead(sheet, new String[]{"编号", "名字", "电话", "头像", "入职时间"});
            System.out.println("ssss");
            System.out.println("pppp"+contactList);
            writeContent(sheet, contactList);
            System.out.println("+++++++");
            workbook.write(new FileOutputStream(file));
            workbook.close();
        }

    }

    private static void writeTitle(Sheet sheet,String title){
        Workbook workbook =sheet.getWorkbook();
        //行
        Row row=sheet.createRow(0);
        //单元格
        Cell cell =row.createCell(0);
        //合并范围
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,5));
        //风格
        CellStyle cellStyle=workbook.createCellStyle();
        //居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        Font font=  workbook.createFont();
        //加粗
        font.setBold(true);
        font.setFontHeight((short) 280);
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);
        cell.setCellValue(title);
    }

    private static void writeHead(Sheet sheet,String[] columnNames){
        Workbook workbook=sheet.getWorkbook();
        //行
        Row row=sheet.createRow(1);
        //单元格风格
        CellStyle cellStyle=workbook.createCellStyle();
        //字体样式
        Font font=workbook.createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        //循环设置头部字体样式
        for(int col=0,len=columnNames.length;col<len;col++){
            Cell cell=row.createCell(col);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(columnNames[col]);
        }
    }

    private static void writeContent(Sheet sheet, List<Contact> contactList){
        Workbook workbook = sheet.getWorkbook();
        for (int row = 2, totalRow = contactList.size() + 2; row < totalRow; row++) {
            Row rowData = sheet.createRow(row);
            // 隐藏行
            // rowData.setZeroHeight(true);
            Contact contact = contactList.get(row - 2);
            System.out.println("-------999"+contactList);
            rowData.createCell(0).setCellValue(contact.getId());
            rowData.createCell(1).setCellValue(contact.getName());
            // insertPicture(sheet, "src/main/resources/pic.png", row, 2);
            insertPicture(sheet, "src/main/resources/pic.jpg", 0, 0, 300, 300, row, 2, row + 1, 3);
            rowData.createCell(3).setCellValue(contact.getPhone());
            rowData.createCell(4).setCellValue(contact.getGender());

            CreationHelper creationHelper = workbook.getCreationHelper();
            CellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy/MM/dd"));
            Cell cell = rowData.createCell(5);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(contact.getDepartment());
        }
    }

    public static void insertPicture(Sheet sheet, String imagePath, int row, int col) {
        Workbook workbook = sheet.getWorkbook();
        try {
            int picIdx = workbook.addPicture(IOUtils.toByteArray(new FileInputStream(imagePath)), Workbook.PICTURE_TYPE_PNG);
            // 创建绘图对象
            Drawing drawing = sheet.createDrawingPatriarch();
            CreationHelper creationHelper = workbook.getCreationHelper();
            ClientAnchor clientAnchor = creationHelper.createClientAnchor();
            clientAnchor.setRow1(row);
            clientAnchor.setCol1(col);
            Picture pic = drawing.createPicture(clientAnchor, picIdx);
            pic.resize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 在指定工作表的指定位置插入图片
     * @param sheet 工作表
     * @param imagePath 图片路径
     * @param leftDX 图片在单元格中离左上角的x距离
     * @param topDY 图片在单元格中离左上角的y距离
     * @param widthDX 图片的宽度
     * @param heightDY 图片的高度
     * @param beginRow 图片开始的行
     * @param beginCol 图片开始的列
     * @param endRow 图片结束的行
     * @param endCol 图片结束的列
     */
    public static void insertPicture(Sheet sheet, String imagePath,
                                     int leftDX, int topDY, int widthDX ,int heightDY,
                                     int beginRow, int beginCol, int endRow, int endCol) {
        Workbook workbook = sheet.getWorkbook();
        Drawing drawing = sheet.createDrawingPatriarch();
        ClientAnchor clientAnchor = workbook.getCreationHelper().createClientAnchor();
        clientAnchor.setDx1(leftDX);
        clientAnchor.setDy1(topDY);
        clientAnchor.setDx2(widthDX);
        clientAnchor.setDy2(heightDY);
        clientAnchor.setRow1(beginRow);
        clientAnchor.setCol1(beginCol);
        clientAnchor.setRow2(endRow);
        clientAnchor.setCol2(endCol);
        try {
            drawing.createPicture(clientAnchor,
                    workbook.addPicture(IOUtils.toByteArray(new FileInputStream(imagePath)), Workbook.PICTURE_TYPE_PNG));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readPicture(Workbook workbook) throws IOException {
        List<PictureData> lst = (List<PictureData>) workbook.getAllPictures();
        for (Iterator it = lst.iterator(); it.hasNext(); ) {
            PictureData pict = (PictureData)it.next();
            String ext = pict.suggestFileExtension();
            byte[] data = pict.getData();
            if (ext.equals("jpeg")){
                FileOutputStream out = new FileOutputStream("pict.jpg");
                out.write(data);
                out.close();
            }
        }
    }
}
