package org.maintest;
import java.awt.AWTException;

import org.base.Baseclass;
import org.pom.Gaming;
import org.pom.LogIn;
import org.pom.MenuBar;
import org.pom.ThumbNails;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Maintest extends Baseclass{
	@BeforeClass
	public void beforeclass() {
		//driverlaunch("edge");
	}
	
	@Test(priority=1)
	public void Loginbtn() throws Exception {
		driverlaunch("edge");
		urllaunch("https://www.crazygames.com/");
		Thread.sleep(2000);
	   // LogIn l1=new LogIn();
	   // l1.loginButton();
	    Gaming g=new Gaming();
	    g.searchGame();
	//MenuBar m=new MenuBar();
	//m.menuFunctions();
	//ThumbNails tn=new ThumbNails();
	//tn.verifyAllGamesImageAndTitle();
	
	}
	@Test(priority=2)
	public void browse() throws InterruptedException, AWTException {
		driverlaunch("chrome");
		urllaunch("https://www.crazygames.com/");
		//Thread.sleep(2000);
	    //LogIn l1=new LogIn();
	    //l1.loginButton();
	    Gaming g=new Gaming();
	    g.searchGame();
	//MenuBar m=new MenuBar();
	//m.menuFunctions();
	//ThumbNails tn=new ThumbNails();
	//tn.verifyAllGamesImageAndTitle();
	}
@AfterMethod
	public void teardown() throws InterruptedException {
		//Thread.sleep(2000);
		//driver.quit();
	}
		
}
