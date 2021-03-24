package excel;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTest {

	
	public static String excleData (int row, int column) throws Exception {
		FileInputStream fi = new FileInputStream(new File("C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\XLTest.xlsx"));    
		     //C:\\Users\\jv20273\\Desktop\\ORHRM.xlsx
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("sheet1");
		String ss = sh.getRow(row).getCell(column).getStringCellValue();
		System.out.println(ss);
		wb.close();
		return ss;
		

	}

}
