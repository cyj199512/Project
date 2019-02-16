package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import common.Common;
import excel.vo.Data;


public class ReadExcel {

	public int readXls() throws IOException {
		InputStream is = new FileInputStream(Common.EXCEL_PATH);
		@SuppressWarnings("resource")
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		int list=0;
//		String[][] data=new String[5][100];; 
//		List<String[][]> list = new ArrayList<String[][]>();
//		
//		// Sheet
		try{
//		for (int numSheet = 0; numSheet < 5; numSheet++) {
//			int count=0;
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
//			if (xssfSheet == null) {
//				continue;
//			}
//			//String sheetName=xssfSheet.getSheetName();
			 int coloumNum=xssfSheet.getRow(0).getPhysicalNumberOfCells();
//			 int rowNum=xssfSheet.getLastRowNum();//获得总行数
//			 int all=rowNum*coloumNum;
//			 
//
//			// Row
//			for (int row = 0; row <= rowNum; row++) {
//				XSSFRow xssfRow = xssfSheet.getRow(row);
//				if (xssfRow != null) {
//					 for (int k = 0; k < coloumNum; k++) {//获取每个单元格  
//						 XSSFCell no =xssfRow.getCell(k);
//		                 data[numSheet][count]=getValue(no);	                 
//		                 count++;  
//		             }
//				}
//			}
//			list.add(data);
//		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	 private String[] removeArrayEmptyTextBackNewArray(String[][] strArray) {
	        List<String[]> strList= Arrays.asList(strArray);
	        List<String[]> strListNew=new ArrayList<>();
	        for (int i = 0; i <strList.size(); i++) {
	            if (strList.get(i)!=null&&!strList.get(i).equals("")){
	                strListNew.add(strList.get(i));
	            }
	        }
	        String[] strNewArray = strListNew.toArray(new String[strListNew.size()]);
	        return   strNewArray;
	    }
	
	
	
	 @SuppressWarnings("static-access")
	private String getValue(XSSFCell xssfCell) {
	        if (xssfCell.getCellType() == xssfCell.CELL_TYPE_BOOLEAN) {
	            
	            return String.valueOf(xssfCell.getBooleanCellValue());
	        } else if (xssfCell.getCellType() == xssfCell.CELL_TYPE_NUMERIC) {
	            
	            return String.valueOf(xssfCell.getNumericCellValue());
	        } else {
	           
	            return String.valueOf(xssfCell.getStringCellValue());
	        }
	    }
}
