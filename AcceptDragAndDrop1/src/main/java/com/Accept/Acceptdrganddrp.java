package com.Accept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Acceptdrganddrp extends Base{



	public static void accEpt1() {

		Actions act1 = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//a[text()='Accept']"));
		act1.moveToElement(src);
		act1.click().build().perform();

	}
	public static void acTion1() throws Exception {

		Actions act2 = new Actions(driver);
		WebElement s = driver.findElement(By.xpath("//*[@id='acceptable']"));
		Thread.sleep(2000);
		act2.dragAndDropBy(s, 200, 50).perform();
	}



	public static void referesh1() {

		driver.navigate().refresh();
	}
	public static void accEpt2() {

		Actions act1 = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//a[text()='Accept']"));
		act1.moveToElement(src);
		act1.click().build().perform();

	}
	public static void acTion3() throws Exception {

		Actions act3 = new Actions(driver);
		WebElement s = driver.findElement(By.xpath("//*[text()='Not  Acceptable']"));
		Thread.sleep(2000);
		act3.dragAndDropBy(s, 200, 50).perform();
	}
   
	public static void referesh2() {

		driver.navigate().refresh();
	}

	public static void acTion4() throws Exception {

		Actions act3 = new Actions(driver);
		WebElement s = driver.findElement(By.xpath("//*[text()='Not  Acceptable']"));
		Thread.sleep(2000);
		act3.dragAndDropBy(s, 200, 50).perform();
	}

 public static void accEpt3() {

	Actions act1 = new Actions(driver);
	WebElement src = driver.findElement(By.xpath("//a[text()='Accept']"));
	act1.moveToElement(src);
	act1.click().build().perform();

}
}