package aajuBaaju;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ReadWriteXL {

	public static String[][] readXL(String fpath, String fsheet) throws Exception{
		String xData[][];
		int xRows,xCols;
		DataFormatter data=new DataFormatter();
		File fstream=new File(fpath);
		FileInputStream mystream=new FileInputStream(fstream);
		HSSFWorkbook mybk=new HSSFWorkbook(mystream);
		HSSFSheet sheet=mybk.getSheet("TestCases");
		xRows=sheet.getLastRowNum();
		xCols=sheet.getRow(0).getLastCellNum();
		xData= new String[xRows][xCols];
		for(int i=0;i<=xRows;i++) {
			HSSFRow row=sheet.getRow(i);
		}
		
		return null;

	}
	public static void writeXL(String fPath, String fSheet, String[][] xData) throws Exception{

		File outFile = new File(fPath);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet osheet = wb.createSheet(fSheet);
		int xR_TS = xData.length;
		int xC_TS = xData[0].length;
		for (int myrow = 0; myrow < xR_TS; myrow++) {
			HSSFRow row = osheet.createRow(myrow);
			for (int mycol = 0; mycol < xC_TS; mycol++) {
				HSSFCell cell = row.createCell(mycol);
				// cell.setCellType(HSSFCell.CELL_TYPE_STRING);
				cell.setCellValue(xData[myrow][mycol]);
			}
			FileOutputStream fOut = new FileOutputStream(outFile);
			wb.write(fOut);
			fOut.flush();
			fOut.close();
		}
		wb = null;
		osheet = null;

}
}
