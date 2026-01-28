package org.orgin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Porunai {
	static WebDriver driver;
public static void Setup() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
}
public static void urlLanuch(String url) {
	driver.get(url);	
}
}