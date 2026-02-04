package org.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Gaming extends Baseclass {
	public void searchGame()  throws AWTException, InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//verify search bar
		WebElement e=driver.findElement(By.id("search-input"));
		e.sendKeys("Super Star Car");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		WebElement a=driver.findElement(By.xpath("//a[@href='https://www.crazygames.com/game/super-star-car']"));
		a.click();
		Thread.sleep(5000);
		WebElement b = driver.findElement(By.xpath("//div[@class='GameContainer']"));
		b.click();
		//verify maximize button
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//iframe[@id='game-iframe']"));
		WebElement l = driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item css-16hlm1x'][3]"));
		Actions a1=new Actions(driver);
		a1.click(l).perform();

}
}
