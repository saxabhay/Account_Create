package genric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static int getRowCount(String path,String sheet){
		int rc=0;
		try{
	    FileInputStream fls=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fls);
		
		rc=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e){}
		return rc;
	}
	public static String getCellValue(String path,String sheet,int r,int c){
		String v="";
		try{
		FileInputStream fls=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fls);
		
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
	}
		catch(Exception e){}
		return v;
}
}