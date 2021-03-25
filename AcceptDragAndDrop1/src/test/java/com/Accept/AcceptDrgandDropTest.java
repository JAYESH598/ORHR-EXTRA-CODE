package com.Accept;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Accept.Acceptdrganddrp;





import com.Accept.Base;

public class AcceptDrgandDropTest extends Base{
	
	@BeforeTest()
	public static void browserLaunch() {
		
		Base.broWser();
	}
	
	
	@Test(priority =1)
	public static void test1() throws Exception {
		Thread.sleep(2000);
		Acceptdrganddrp.accEpt1();
		
	}

	@Test(priority =2)
	public static void test2 () throws Exception {
		Thread.sleep(2000);
		Acceptdrganddrp.acTion1();	
	}
	
	
	@Test(priority =3)
	public static void tr(){
		
		Acceptdrganddrp.referesh1();
	}
	
	
	@Test(priority =4)
	public static void test3() throws Exception {
		Thread.sleep(2000);
		Acceptdrganddrp.accEpt1();
		
	}
	@Test(priority =5)
	public static void test4() throws Exception {
		Thread.sleep(2000);
		Acceptdrganddrp.acTion3();	
	}
	
	
	@Test(priority =6)
	public static void tr1(){
		
		Acceptdrganddrp.referesh1();
	}
	
	@Test(priority =7)
	public static void test5() throws Exception {
		Thread.sleep(2000);
		Acceptdrganddrp.acTion4();	
	}
	
	
	@Test(priority =8)
	
	public static void test6() throws Exception {
		Thread.sleep(2000);
		Acceptdrganddrp.accEpt3();
	}
 
//  @AfterTest()
//	public static void test() {
//		Base.browserClose();
//	}
}
