package com.Accept;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	public static WebDriver driver;
	public static void broWser() {
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jv20273\\eclipse-workspace\\AcceptDragAndDrop1\\chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		assertTrue(driver.getTitle().contains("ToolsQA"));
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println("ToolsQA:"+title);
		
		
	}
	
	
	public static void browserClose() {
		
		driver.quit();
		
	}

}
