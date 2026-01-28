import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Day1 {
public static void main(String args[])throws InterruptedException {
	System.setProperty	
	w.get("https://www.crazygames.com");
	w.manage().window().maximize();
	Thread.sleep(2000);
	WebElement element=w.findElement(By.xpath("//button[text()='Log in']"));
	element.click();
	// WebElement or=w.findElement(By.xpath("or"));
	Thread.sleep(1000);
	WebElement e=w.findElement(By.xpath("//input[@name='email']"));
	e.sendKeys("karthikp.2k41@gmail.com");
	WebElement c=w.findElement(By.xpath("//button[text()='Continue']"));
	c.click();
	Thread.sleep(15);
WebElement pass=w.findElement(By.xpath("//input[@type='password']"));
 Boolean visable =pass.isDisplayed();
 System.out.println("visable");
 Thread.sleep(2000);
WebElement j=w.findElement(By.xpath("//input[@type='checkbox']"));
j.click();
w.findElement(By.xpath("//button[text()='continue']")).click();

//JavascriptExecutor js=(JavascriptExecutor)w;
 js.executeScript("arguements[0].setAttribute('value','crazy@21')",pass);

}

}

