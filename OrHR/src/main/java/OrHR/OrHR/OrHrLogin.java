package OrHR.OrHR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import excel.ExcelTest;

public class OrHrLogin extends BaseBrowser {
	public static ExcelTest ext;


	
	public static void elements() throws Exception {
		ext  = new ExcelTest();
		
		OrHrLogin hrl = new OrHrLogin();
		
		WebElement un = driver.findElement(hrl.username);
		String usn = ext.excleData(1, 0);
		un.sendKeys(usn);
		
		WebElement pw = driver.findElement(hrl.Password);
		String psw =ext.excleData(1, 1);
		pw.sendKeys(psw);
		
		WebElement button = driver.findElement(hrl.Button);
		button.click();
	}

}
