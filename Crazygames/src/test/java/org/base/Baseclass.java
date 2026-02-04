package org.base;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Baseclass {
		public static WebDriver driver;
		public static Robot r;
		public static Actions a;
		public static Alert al;
		public static JavascriptExecutor js;
		public static void driverlaunch(String name) {
			if(name.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			}
			else if(name.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else {
				System.err.println("invalid browser input");
			}
		}
		public static void urllaunch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		public static void timeout(int sec) {
			driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
		}
		public static void  send(WebElement wb,String valu) {
			wb.sendKeys(valu);
		}

		public static void exit() {
		driver.quit();  
		}
		public static void enter() throws AWTException {
		    r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
		}

