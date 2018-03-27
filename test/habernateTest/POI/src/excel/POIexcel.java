package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POIexcel {
	//POI生成Excel文件
	
	public static void main(String[] args) {
		String[] title={"id","name","sex"};
		 	
		//创建Excel工作簿
		HSSFWorkbook workbook=new HSSFWorkbook();
		//创建个工作表sheet
		HSSFSheet sheet=workbook.createSheet();
		//创建第一行
		HSSFRow row=sheet.createRow(0);
		
		HSSFCell cell=null;
		//插入第一条数据
		for (int i = 0; i < title.length; i++) {
			cell=row.createCell(i);
			cell.setCellValue(title[i]);
		}
		//追加数据
		for (int i = 1; i < 10; i++) {
			HSSFRow nextrow=sheet.createRow(i);
			HSSFCell cll2=nextrow.createCell(0);
			cll2.setCellValue("a"+i);
			cll2=nextrow.createCell(1);
			cll2.setCellValue("user");
			cll2=nextrow.createCell(2);
			cll2.setCellValue("男");
		}
		
		//创建一个文件
		File file=new File("E:/POI/jxl_test.xls");
		
		try {
			file.createNewFile();
			//将Excel存盘
			FileOutputStream stream=FileUtils.openOutputStream(file);
			workbook.write(stream);
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
