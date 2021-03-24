

package OrHR.OrHR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class BaseBrowser  extends ObjectRepo{
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	
	
	public static void browser1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().deleteAllCookies();
		
		reporter =new ExtentHtmlReporter("./Reports/OrangeHRM.html");
			
         // Create object of ExtentReports class- This is main class which will create report
	     extent = new ExtentReports();
	    
         // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
         // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("LoginTest");
	    
         // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to OrangeHRM");
	   
	    logger.log(Status.PASS, "Title verified");
	   
         // Flush method will write the test in report- This is mandatory step  InFO
	    extent.flush();
		
         // You can call createTest method multiple times depends on your requirement
         // In our case we are calling twice which will add 2 testcases in our report
	    ExtentTest logger2=extent.createTest("Logoff Test");
	    
	    logger2.log(Status.FAIL, "Title verified");
	    //logger2.addScreenCaptureFromPath("C:/Users/jv20273/eclipse-workspace/OrHR/aa.jpeg");
	    
	    //logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/jv20273/eclipse-workspace/OrHR/aa.jpg").build());
//     
	 //  logger2.pass("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\aa.jpg").build());
//
//         // This will add another test in report
	    extent.flush();
		
	}    
	    
	    
	    public static void takeSnapShot() throws Exception{
	    	
	    /*	String old = "jay12.jpeg";
	    	String ss = "C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\scrshort\\";
	    	
	    	  File file = new File(ss+old);
	          
	          if(file.delete())
	          {
	              System.out.println("File deleted successfully");
	          }
	          else
	          {
	              System.out.println("Failed to delete the file");
	          }*/
	    	FileUtils.deleteDirectory(new File("C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\scrshort"));

	          
	      


	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination
	                
	    	    	String timeStamp1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	                File DestFile=new File("C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\scrshort\\"+timeStamp1+"jay12.jpeg");

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);
}
	    
	
	
	/*public static void Readproperties() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\jv20273\\eclipse-workspace\\OrHR\\src\\main\\java\\OrHR\\OrHR\\ObjectRepo.java");
	    prop.load(fis);
	}*/
	
	public static void closeBrowser() {
		
		driver.close();
	}

}
