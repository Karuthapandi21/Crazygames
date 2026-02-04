package org.pom;
import java.util.concurrent.TimeUnit;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Directsignin extends Baseclass{
	public void directSignIn(WebDriver driver) {
		 WebDriver KP=driver;
		 KP.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement e=KP.findElement(By.xpath("//button[@id='header-login-button']"));		
		e.click();		
		WebElement obj=KP.findElement(By.xpath("//span[text()='Sign in with Google']"));
		obj.click();
	}

}
