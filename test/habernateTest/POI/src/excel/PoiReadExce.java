package excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Sheet;

public class PoiReadExce {
	//poi解析
	
	public static void main(String[] args) {
		File file=new File("E:/POI/jxl_test.xls");
		
		try {
			//创建Excel，读取内容
			HSSFWorkbook workbook=new HSSFWorkbook(FileUtils.openInputStream(file));
			//获取第一个工作表workbook.getsheet("sheet0")
			//HSSFSheet sheet=workbook.getSheet("Sheet0");	---方法一
			//读取默认第一个工作表
			HSSFSheet sheet=workbook.getSheetAt(0);
			int firstRowNum=0;
			//获取sheet中的最后一行
			int lastRowNum= sheet.getLastRowNum();
			for (int i = firstRowNum; i < lastRowNum; i++) {
				HSSFRow row=sheet.getRow(i);
				//获取当前行最后单元格列号
				int lastCellNum=row.getLastCellNum();
				for (int j = 0; j < lastCellNum; j++) {
					HSSFCell cell=row.getCell(j);
					String value=cell.getStringCellValue();
					System.out.print(value+" ");
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
