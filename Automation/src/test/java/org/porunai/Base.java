package org.porunai;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Base {
	static WebDriver driver;
	 static WebElement w;
	// @BeforeMethod//
public static void Browserlanuch () {
	WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
}
//@Parameters("url")//
//@Test//	 
public static void URL(String url) {
	driver.get(url);
}
//@AfterMethod//
public static void Maximize() {
	driver.manage().window().maximize();
}
/*public static void findElements() {
	w=driver.findElement(By.id("search-input"));
}*/

public static void  sendValue(String k ) {
	w.sendKeys(k);	
}
public static void Ajex() {
	Actions a=new Actions(driver);
	a.click(w);
}
public static void Enter() throws AWTException {
	Robot r=new Robot(); 
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
 public static void quit() {
	driver.close();
 }
}
