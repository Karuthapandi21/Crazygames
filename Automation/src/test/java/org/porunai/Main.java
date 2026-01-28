package org.porunai;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class Main extends Search{
public static void main(String args[])  throws AWTException, InterruptedException, IOException { 
	Browserlanuch();
	URL("https://www.crazygames.com");
	Maximize();
	Search a=new Search();
	a.find();
	a.set("snake and ladders");
	Ajex();
	Enter();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//a.Screenshot("photo");
	//driver.close();
	a.gameLoading();
	a.Click();
	//quit();
	
	//Thread.sleep(2000);
	
}
}
