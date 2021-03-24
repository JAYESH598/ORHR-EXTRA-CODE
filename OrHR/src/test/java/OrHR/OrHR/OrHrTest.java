package OrHR.OrHR;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrHrTest extends BaseBrowser{

	@BeforeTest
	public static void test1() throws Exception {
		browser1();
	takeSnapShot();
	
		
	}
	
	@Test(priority =1)
	
	public static void test2() throws Exception {
	OrHrLogin.elements();
	}
	
	@Test(priority =2 )
	public static void test3(){
		BaseBrowser.closeBrowser();
	}
	
//	@Test(priority =3)
//	public static void test4() throws Exception {
//		ExcelTest.excleData(1,0);
//		ExcelTest.excleData(1, 1);
//	}
}
