package POI;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JxlReadExcel {
	//jxl解析Excel
	public static void main(String[] args) {
		
		try {
			//创建workbook
			Workbook workbook=Workbook.getWorkbook(new File("E:/POI/jxl_test.xls"));
			//获取工作表sheet
			Sheet sheet=workbook.getSheet(0);
			//获取数据
			for (int i = 0; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell=sheet.getCell(j,i);
					System.out.print(cell.getContents()+" ");
				}
				System.out.println();
			}
			workbook.close();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
