package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileHandle 

{

	public static void writeData(int i,int j,int k,String str) throws IOException
	{
		String path=System.getProperty("user.dir")+"\\TestData\\Exceldata.xlsx";
		
		File src=new File(path);
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(k);
		
		File fout= new File(path);
		
		FileOutputStream fo= new FileOutputStream(fout);
		
		sh1.createRow(i).createCell(j).setCellValue(str);	
		
		wb.write(fo);
		
		fo.close();
	}
	
	
	
}
