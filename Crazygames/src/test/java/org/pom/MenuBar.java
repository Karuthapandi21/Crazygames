package org.pom;
import java.util.concurrent.TimeUnit;
import org.base.Baseclass;
import org.openqa.selenium.By;
public class MenuBar extends Baseclass  {	
public void menuFunctions() throws InterruptedException {
		//verify menu bar functions
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@alt='Basketball icon'][1]")).click();
		Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@alt='Recent icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Multiplayer icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Trending icon']")).click();
		driver.findElement(By.xpath("//img[@alt='New icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Updated icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Originals icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Action icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Action icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Sports icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Shooting icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Home icon'][1]")).click();
	  driver.findElement(By.xpath("//button[@aria-label='Open/Close sidebar']")).click();	
}
	
}
